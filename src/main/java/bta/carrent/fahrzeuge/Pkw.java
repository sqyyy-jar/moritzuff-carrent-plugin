package bta.carrent.fahrzeuge;

public class Pkw {

    private String name;
    private int grundtarif;
    private boolean verfuegbarkeit;
    private int tuerenanzahl;
    private String getriebe;

    public Pkw(String name, int grundtarif, boolean verfuegbarkeit, int tuerenazahl, String getriebe) {
        this.name = name;
        this.grundtarif = grundtarif;
        this.verfuegbarkeit = verfuegbarkeit;
        this.tuerenanzahl = tuerenazahl;
        this.getriebe = getriebe;
    }

    @Override
    public String toString() {
        return "Pkw{" +
                "name='" + name + '\'' +
                ", grundtarif=" + grundtarif +
                ", verfuegbarkeit=" + verfuegbarkeit +
                ", tuerenazahl=" + tuerenanzahl +
                ", getriebe='" + getriebe + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrundtarif() {
        return grundtarif;
    }

    public void setGrundtarif(int grundtarif) {
        this.grundtarif = grundtarif;
    }

    public boolean isVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public void setVerfuegbarkeit(boolean verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

    public int getTuerenazahl() {
        return tuerenanzahl;
    }

    public void setTuerenazahl(int tuerenazahl) {
        this.tuerenanzahl = tuerenazahl;
    }

    public String getGetriebe() {
        return getriebe;
    }

    public void setGetriebe(String getriebe) {
        this.getriebe = getriebe;
    }
}
