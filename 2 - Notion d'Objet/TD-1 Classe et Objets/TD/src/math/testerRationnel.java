/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author tmichaud
 */
public class testerRationnel {
    public static void main(String[] args) {
        
        Rationnel r1,r2,r3;
        
        r1=new Rationnel(1,2);
        r2=new Rationnel(1,3);
        r3=new Rationnel();
        
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.print("Produit : ");
        r3=r1.calculerProduit(r2);
        System.out.println(r3);
        
        System.out.print("Somme : ");
        r3=r1.calculerSomme(r2);
        System.out.println(r3);
        
        System.out.print("Quotient : ");
        r3=r1.calculerQuotient(r2);
        System.out.println(r3);
        
        System.out.print("Comparaison : ");
        System.out.println(r1+"est plus grand que"+r2+" "+r1.estPlusGrand(r2));
        
    }
}
