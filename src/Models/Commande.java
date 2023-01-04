package Models;

public class Commande {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String date;
    private String montant;
    private Paiemnet paiement;
    private static int nbreCommande;

    public static int getNbreCommande() {
        return nbreCommande;
    }

    public static void setNbreCommande(int nbreCommande) {
        Commande.nbreCommande = nbreCommande;
    }

    public Commande(String date, String montant, Paiemnet paiement) {
        nbreCommande++;
        this.id=nbreCommande;
        this.date = date;
        this.montant = montant;
        this.paiement = paiement;
    }

    public Paiemnet getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiemnet paiement) {
        this.paiement = paiement;
    }

    public Commande(String date, String montant) {
        nbreCommande++;
        this.id=nbreCommande;
        this.date = date;
        this.montant = montant;
    }

    public Commande() {
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Commande [id=" + id + ", date=" + date + ", montant=" + montant + ", paiement=" + paiement + "]";
    }
    
}
