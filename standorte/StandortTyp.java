package org.standorte;

public enum StandortTyp {
    STRAND("Strand"),
    DSCHUNGEL("Dschungel"),
    BRUECKE("Hängebrücke"),
    VERLASSENE_HUETTE("Varlassene Hütte"),
    DUNKLE_HOEHLE("Dunkle Hölle"),
    WASSERFALL("Wasserfall"),
    VERFLUCHTER_TEMPEL("Verfluchter Tempel"),
    NEBELMOOR("Nebenmoor"),
    LAGERPLATZ("Lagerplatz"),
    GEHEIME_BUCHT("Geheime Bucht");
    public final String titel;

    private StandortTyp(String titel) {
        this.titel = titel;
    }
}