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
public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;
    
    public CompteEpargne(){
        System.out.println("Constructeur default CompteEpargne");
    }
    
    public CompteEpargne(double tauxInteret){
        this.tauxInteret = tauxInteret;
        System.out.println("Constructeur CompteEpargne avec 1 Paramètre");
    }
    
    public CompteEpargne(double tauxInteret, double solde){
         super(solde);
         this.tauxInteret = tauxInteret;
        System.out.println("Constructeur CompteEpargne avec 2 paramètres");
    }
   
    public CompteEpargne(CompteEpargne ce){
        super(ce);
        this.tauxInteret = ce.tauxInteret;
        System.out.println("Constructeur copie CompteEpargne");
    }
        
    public double calculerInteret() {
        double interet;
        interet = solde * tauxInteret;
        return interet;
    }
    
    public void crediterInteret(){
        solde += calculerInteret();
    }
    
    public void changerTaux(double nouveauTaux){
        this.tauxInteret = nouveauTaux;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" + "tauxInteret=" + tauxInteret + "sodes" + solde +'}';
    }
    
    
}
