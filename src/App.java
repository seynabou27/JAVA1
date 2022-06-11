import java.util.Scanner;

import Modeles.Chambre;
import Services.ServiceList;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner input =new Scanner(System.in);
        ServiceList service =new ServiceList();
        Chambre chambre;
        int choix; 
        int  numCh, numChambre;
        int nbreEtage ;
       
           
        do {
            System.out.println("1-Ajouter chambre");
            System.out.println("2-Lister chambre");
            System.out.println("8-Quitter");
            choix=input.nextInt();

            
        } while (condition);

    }
}
