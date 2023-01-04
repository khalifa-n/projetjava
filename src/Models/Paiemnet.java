package Models;

public class Paiemnet {
    private String date;
    private String type;
    private String refOm;

    public Paiemnet(String date, String type, String refOm) {
        this.date = date;
        this.type = type;
        this.refOm = refOm;
    }

    public Paiemnet() {
    }

    public String getRefOm() {
        return refOm;
    }

    public void setRefOm(String refOm) {
        this.refOm = refOm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Paiemnet [date=" + date + ", type=" + type + ", refOm=" + refOm + "]";
    }
}
