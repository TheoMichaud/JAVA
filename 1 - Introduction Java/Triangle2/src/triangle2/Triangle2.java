/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle2;

import java.util.Scanner;

/**
 *
 * @author tmichaud
 */
public class Triangle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nbreCote, compteur = 1, nbreEtoile = 1;
        Scanner lectureNbre = new Scanner(System.in);
        nbreCote = lectureNbre.nextInt();
        System.out.println("Saisir un chiffre : ");
        for (compteur = 1; compteur <= nbreCote; compteur++){
            for(nbreEtoile=1; nbreEtoile <= compteur; nbreEtoile++){
                System.out.print("*");
            }
            System.out.println("");
        }
        lectureNbre.close();
        
    }
    
}
