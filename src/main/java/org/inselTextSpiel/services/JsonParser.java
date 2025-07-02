package org.inselTextSpiel.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JsonParser {
    private final Map<String, JsonNode> jsonDaten = new HashMap<>();

    private JsonNode jsonLaden(String pfad) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(pfad);
        try {
            if (inputStream != null) {
                return new ObjectMapper().readTree(inputStream);
            } else {
                throw new RuntimeException(pfad + " nicht gefunden!");
            }
        } catch (Exception e) {
            throw new RuntimeException("Fehler beim Laden der JSON-Datei: " + e.getMessage(), e);
        }
    }

    private JsonNode lazyLoad(String pfad) {
        String p = pfad + ".json";
        JsonNode rootNode;
        if (!jsonDaten.containsKey(p)) {
            rootNode = jsonLaden(p);
            jsonDaten.put(p, rootNode);
        } else {
            rootNode = jsonDaten.get(p);
        }
        return rootNode;
    }

    public Map<String, String> getKeyValue(String pfad, String nodeName) {
        Iterator<Map.Entry<String, JsonNode>> fieldEntry = lazyLoad(pfad).path(nodeName).fields();
        Map<String, String> result = new HashMap<>();
        while (fieldEntry.hasNext()) {
            Map.Entry<String, JsonNode> entry = fieldEntry.next();
            result.put(entry.getKey(), entry.getValue().asText());
        }
        return result;
    }

    public String getValue(String pfad, String[] keys) {
        JsonNode rootNode = lazyLoad(pfad);
        for (String key : keys) {
            rootNode = rootNode.path(key);
        }
        return rootNode.asText();
    }
}