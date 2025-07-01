package org.charaktere;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserCharakter extends Charakter {
    private final int alter;
    private int weisheit;
    private String kampfmotto;


    public UserCharakter(String name) {
        super(name);
        this.alter = super.getRandomZahl(100);
        this.weisheit = alter > 60 ? alter * 20 : alter * 10;
        onInit();
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
    public Map<String, Object> getEigenschaften() {
        Map<String, Object> daten = new HashMap<>(super.getEigenschaften());
        daten.put("weisheit", this.weisheit);
        daten.put("alter", this.alter);
        daten.put("kampfmotto", this.kampfmotto);
        return daten;
    }

    private void onInit() {
        System.out.printf("""
                Charakter names <%s> wurde erfolgreich erstell.
                Alle Charakteristigen wurde zufaligeweisse eingestzt
                """, this.getName());
    }

    @Override
    public void schowEigenschaften() {
        String str = String.format("""
                        Name: %s,
                        Alter: %d,
                        Lebenspunkte: %d,
                        Lebenserfahrung: %d\n""", this.getName(), this.alter, this.lebenspunkte,
                this.weisheit);
        System.out.printf(str);
    }
}
