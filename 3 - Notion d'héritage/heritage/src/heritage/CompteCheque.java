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
public class CompteCheque extends CompteBancaire {
    
    private double decouvertAutorise;
    
    public CompteCheque(){
        System.out.println("Constructeur default CompteCheque");
    }
    
    public CompteCheque(double decouvertAutorise){
        this.decouvertAutorise = decouvertAutorise;
        System.out.println("Constructeur CompteCheque avec 1 Paramètre");
    }
    
    public CompteCheque(double decouvertAutorise, double solde){
         super(solde);
         this.decouvertAutorise = decouvertAutorise;
        System.out.println("Constructeur CompteCheque avec 2 paramètres");
    }
   
    public CompteCheque(CompteCheque cc){
        super(cc);
        this.decouvertAutorise = cc.decouvertAutorise;
        System.out.println("Constructeur copie CompteCheque");
    }
    
    public void changerDecouvert(double nouveauDecouvert){
        
        this.decouvertAutorise = nouveauDecouvert;
    }

    @Override
    public String toString() {
        return "CompteCheque{" + "decouvertAutorise=" + decouvertAutorise + '}';
    }
         
}
