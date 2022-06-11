package Modeles;

public class Bourssier {
    
    private TypeBourse typeBourse;

    public TypeBourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }

    private int valeur;

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    private Chambre chambre;

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
