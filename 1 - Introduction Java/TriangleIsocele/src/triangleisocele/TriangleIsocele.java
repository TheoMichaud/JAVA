/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleisocele;

import java.util.Scanner;

/**
 *
 * @author tmichaud
 */
public class TriangleIsocele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nbreBase, nbreVal = 1, nbreEtoile;
        int nbreEspace = 0, compteVal;
        Scanner lectureNbre = new Scanner(System.in);
        System.out.println("Indiquez le nb d'etoile de la base impaire superieur a 1 : ");
        nbreBase = lectureNbre.nextInt();
        System.out.println(" ");
        
        while (nbreVal <= nbreBase){
            nbreEspace = nbreBase - nbreVal;
            for(compteVal = 1; compteVal <= nbreEspace/2; compteVal++){
                System.out.print(" ");
            }
            for(compteVal = 1; compteVal <= nbreVal; compteVal++){
                System.out.print("*");
            }
            for(compteVal = 1; compteVal <= nbreEspace/2; compteVal++){
                System.out.print(" ");
            }
            System.out.println("");
            nbreVal = nbreVal + 2;
        }
        lectureNbre.close();
    }
    
}
