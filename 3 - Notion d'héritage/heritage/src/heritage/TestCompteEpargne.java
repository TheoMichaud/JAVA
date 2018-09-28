/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 *
 * @author tmichaud
 */
public class TestCompteEpargne {
    
       public static void main(String[] args) {
        // TODO code application logic here
        CompteEpargne ce;
        double interet;
        
        ce = new CompteEpargne(0.05);
        System.out.println(ce);             //Solde a 0 car affichage du solde avant methode
        
        ce.deposer(100.0);
        
        System.out.println(ce);             //Solde non nul
        System.out.println("");
        
        interet = ce.calculerInteret();
       System.out.println("Interet : "+ interet);
       ce.crediterInteret();
       System.out.println(ce);              //affichage du solde apres methode CrediterInteret
       System.out.println("");
       
       ce = new CompteEpargne(0.06, 100);
       interet = ce.calculerInteret();
       System.out.println(ce);
       System.out.println("");
       
       interet= ce.calculerInteret();
       System.out.println("Interet : " + interet);
       ce.crediterInteret();
       System.out.println(ce);
    }
       
}
