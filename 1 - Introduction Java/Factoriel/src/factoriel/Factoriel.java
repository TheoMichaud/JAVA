/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriel;
import java.util.Scanner;


/**
 *
 * @author tmichaud
 */
public class Factoriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int facto,produiFact = 1;
        int i;
        Scanner lectureNbre = new Scanner (System.in);
        
        System.out.println("Entrez un nombre : ");
        facto = lectureNbre.nextInt();
        
        for(i = 1; i <= facto; i++){
            produiFact = produiFact * i;
        }
        
        System.out.println("Le produit factoriel "+facto+"est : "+produiFact);
        lectureNbre.close();
    }
    
}
