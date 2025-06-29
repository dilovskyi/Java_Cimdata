package org.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

public class JsonParser {
    private Map introTexte;
    private Map<String, Object> myMap;
    private JsonNode rootJsonNode;

    public JsonParser(String pfad) {
        jsonLaden(pfad);
    }

    public String getText(String hauptKey) {
        return rootJsonNode.path(hauptKey).asText();
    }

    public String getText(String hauptKey, String innereKey) {
        return rootJsonNode.path(hauptKey).path(innereKey).asText();
    }

    public String getText(String[] keyArray) {
        JsonNode node = rootJsonNode;
        for (String key : keyArray) {
            node = node.path(key);
        }
        return node.asText();
    }


    // TODO
    private void jsonNodeParcing(JsonNode node) {

        Iterator<Map.Entry<String, JsonNode>> it = rootJsonNode.fields();
        while (it.hasNext()) {
            Map.Entry<String, JsonNode> entry = it.next();
            Map<String, String> toOut;
            if (entry.getValue().getNodeType().equals(JsonNodeType.OBJECT)) {
                System.out.print("Object!");
            } else {
                introTexte.put(entry.getKey(), entry.getValue().textValue());
            }
            System.out.println(entry.getValue());
        }
    }

    private void jsonLaden(String pfad) {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(pfad);
        try {
            if (inputStream != null) {
                rootJsonNode = mapper.readTree(inputStream);
//                introTexte = mapper.readValue(inputStream, Map.class);
//
//                Iterator<Map.Entry<String, JsonNode>> it = rootJsonNode.fields();
//                while (it.hasNext()) {
//                    Map.Entry<String, JsonNode> entry = it.next();
//                    Map<String, String> toOut;
//                    if (entry.getValue().getNodeType().equals(JsonNodeType.OBJECT)) {
//                        System.out.print("Object!");
//                    } else {
//                        Map<String, String> ster = new HashMap<String, String>();
//
//                    }
//                }

            } else {
                throw new RuntimeException(pfad + " nicht gefunden!");
            }
        } catch (Exception e) {
            throw new RuntimeException("Fehler beim Laden der JSON-Datei: " + e.getMessage(), e);
        }
    }
}