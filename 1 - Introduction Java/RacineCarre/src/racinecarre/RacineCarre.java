/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racinecarre;

/**
 *
 * @author tmichaud
 */
public class RacineCarre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 2;
        double r = Math.sqrt(i);
        System.out.print("La racine carré de : ");
        System.out.print(i);
        System.out.print(" est ");
        System.out.print(r);
        System.out.print(".");
        i=5;
        r=Math.sqrt(i);
        System.out.print("\nLa racine carré de "+i+" est "+r+".");
        System.out.print("\n\tAutre écriture formatée : ");
        System.out.format("\tLa racine carré de %d est %2.4f.\n",i,r);
        
    }
    
}
