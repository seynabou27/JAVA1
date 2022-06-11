package Services;

import java.util.ArrayList;

import Modeles.Chambre;
import Modeles.Pavillon;

public class ServiceList implements IService{

    private ArrayList<Chambre> bdchambres = new ArrayList<>();
    private ArrayList<Pavillon> bdPavillons = new ArrayList<>();


    @Override
    public void ajouterChambre(Chambre chambre) {
        bdchambres.add(chambre);
        
    }

    @Override
    public void ajouterChambre(Chambre chambre, Pavillon pavillon) {
        // affecter une chambre a un pavillon

        chambre.setPavillon(pavillon);

        bdchambres.add(chambre);        
    }

    @Override
    public Chambre rechercheChambre(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void modifierChambre(Chambre chambre) {
        for (int index = 0; index < bdchambres.size(); index++) {
            if (bdchambres.get(index).equals(chambre)) {
                bdchambres.set(index, chambre);

            }

        }        
    }

    @Override
    public void listerChambre() {
        for (Chambre chambre : bdchambres) {
            System.out.println(chambre);
        }        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        bdPavillons.add(pavillon);
        
    }

    @Override
    public void ajouterChambre(Pavillon pavillon, ArrayList<Chambre> chambres) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Pavillon recherchePavillon(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void modifierPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        // TODO Auto-generated method stub
        
    }
    
}
