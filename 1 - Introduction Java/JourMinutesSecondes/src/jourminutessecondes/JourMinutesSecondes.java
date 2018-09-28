/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jourminutessecondes;
import java.util.Scanner;

/**
 *
 * @author tmichaud
 */
public class JourMinutesSecondes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nbreSecondes;
        int jours = 0, heures = 0, minutes = 0, secondes, reste;
        Scanner lectureSeconde = new Scanner(System.in);
        System.out.println("Saisir le nombres de secondes : ");
        nbreSecondes = lectureSeconde.nextInt();
        
        jours = nbreSecondes / (3600 *24);
        heures = (nbreSecondes - jours * 24 * 3600) / 3600;
        minutes = (nbreSecondes - jours * 24 * 3600 - heures * 3600) / 60;
        secondes = nbreSecondes - jours * 24 * 3600 - heures * 3600 - minutes * 60;
        
        System.out.println("\n\tLa conversion de "+nbreSecondes+"secondes est de ");
        System.out.println(jours + " jours "+heures+" heures "+minutes+" minutes "+secondes+" secondes\n");
        lectureSeconde.close();
        
        
        
    }
    
}
