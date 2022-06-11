package Modeles;

import java.util.ArrayList;

public class Chambre {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int numChambre;

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    private TypeChambre type;
    
    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    private Pavillon pavillon;

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    private ArrayList boursier;

    public ArrayList getBoursier() {
        return boursier;
    }

    public void setBoursier(ArrayList boursier) {
        this.boursier = boursier;
    }

    private int nbreEtage;

    public int getNbreEtage() {
        return nbreEtage;
    }

    public void setNbreEtage(int nbreEtage) {
        this.nbreEtage = nbreEtage;
    }
}

