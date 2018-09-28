/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banques;

/**
 *
 * @author tmichaud
 */
public class CompteBancaire {
    
    private double solde;
    private double decouvert;
    
    public CompteBancaire(){
    }
    
    public CompteBancaire(double solde, double decouvert){
        this.solde = solde;
        this.decouvert = decouvert;
    }
    
    void deposer(double sommeADeposer) {
        if(sommeADeposer > 0){
            solde += sommeADeposer;
        }
    }
    
    void retirer(double sommeARetirer) {
        if(sommeARetirer > 0){
            if((solde + decouvert) >= sommeARetirer){
                solde -= sommeARetirer;
            }
        }
    }
    
    void changerDecouvert(double nouveauDecouvert) {
        if(solde + nouveauDecouvert >= 0){
            decouvert = nouveauDecouvert;
        }
    }
    
    void afficher(){
        System.out.println("Le solde du compte est de "+ solde +"€");
        System.out.println("");
    }
    
}
