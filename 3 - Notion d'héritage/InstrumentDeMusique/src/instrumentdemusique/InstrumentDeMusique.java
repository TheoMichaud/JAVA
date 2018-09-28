/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentdemusique;

/**
 *
 * @author tmichaud
 */
public class InstrumentDeMusique {

    protected String nom;

    public InstrumentDeMusique() {
        System.out.println("Constructeur défaut InstrumentDeMusique");
    }

    public InstrumentDeMusique(String nom){
        this.nom = nom;
        System.out.println("Constructeur avec parametre InstrumentDeMusique");
    }
    
    public InstrumentDeMusique(InstrumentDeMusique instrument){
        this.nom = instrument.nom;
        System.out.println("Constructeur copie InstrumentDeMusique");
    }
    
    public void afficher(){
        System.out.println("nom : "+nom);
    }

}
