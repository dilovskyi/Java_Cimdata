package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserCharakter extends GameCharakter {
    private final int alter;
    private int weisheit;
    private String kampfmotto;


    public UserCharakter(String name) {
        super(name);
        this.alter = super.getRandomZahl(100);
        this.weisheit = alter > 60 ? alter * 20 : alter * 10;
    }

    public String getMotto() {
        return this.kampfmotto.isEmpty() ? "Du hast noch keines" : this.kampfmotto;
    }

    public void setMotto(String motto) {
        this.kampfmotto = Objects.equals(motto, "") ? "keines" : motto;
    }

    public int getWeisheit() {
        return this.weisheit;
    }

    public void setWeisheit(int weisheit) {
        this.weisheit = weisheit;
    }

    @Override
    public Map<String, Object> getEigenschaftenInfo() {
        Map<String, Object> daten = new HashMap<>(super.getEigenschaftenInfo());
        daten.put("weisheit", this.weisheit);
        daten.put("alter", this.alter);
        daten.put("kampfmotto", this.kampfmotto);
        return daten;
    }
}

/*
    daten.put("kampfmotto", this.kampfmotto);
    daten.put("alter", this.alter);
    daten.put("weisheit", this.weisheit);
 */