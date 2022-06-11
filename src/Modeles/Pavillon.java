package Modeles;

import java.util.ArrayList;

public class Pavillon {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int numPavillon;

   

    public int getNumPavillon() {
        return numPavillon;
    }

    public void setNumPavillon(int numPavillon) {
        this.numPavillon = numPavillon;
    }

    private int nbreEtage;

    public int getNbreEtage() {
        return nbreEtage;
    }

    public void setNbreEtage(int nbreEtage) {
        this.nbreEtage = nbreEtage;
    }

    private  ArrayList Chambre ;

    public ArrayList getChambre() {
        return Chambre;
    }

    public void setChambre(ArrayList chambre) {
        Chambre = chambre;
    }

    

}
