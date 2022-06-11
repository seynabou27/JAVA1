package Services;

import java.util.ArrayList;

import Modeles.Chambre;

import Modeles.Pavillon;

public interface IService {

    public void ajouterChambre(Chambre chambre);

    public void ajouterChambre(Chambre chambre, Pavillon pavillon);

    public Chambre rechercheChambre(int id);

    public void modifierChambre(Chambre chambre);

    public void listerChambre();

    public void archiverChambre(Chambre chambre);

    public void ajouterPavillon(Pavillon pavillon);

    public void ajouterChambre(Pavillon pavillon,ArrayList<Chambre>chambres);

    public Pavillon recherchePavillon(int id );

    public void modifierPavillon(Pavillon pavillon);

    public void listerPavillon();
    
    
}
