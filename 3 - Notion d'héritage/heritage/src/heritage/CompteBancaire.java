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
public class CompteBancaire {
    protected double solde;
    
    public CompteBancaire(){
        System.out.println("Constructeur default CompteBancaire");
    }
    
    public CompteBancaire(double solde){
        this.solde = solde;
        System.out.println("Constructeur CompteBancaire avec Paramètre");
    }
    
     public CompteBancaire(CompteBancaire cb){
         this.solde = cb.solde;
        System.out.println("Constructeur copie CompteBancaire");
    }
    
    public void deposer(double somme) {
        if(somme > 0){
            solde += somme;
        }
    }
    
    public void retirer(double retrait) {
        if((retrait > 0) && (solde >= retrait)){
            solde -= retrait;
        }
    }

    @Override
    public String toString() {
        return "CompteBancaire{" + "solde=" + solde + '}';
    }
    
    
}
