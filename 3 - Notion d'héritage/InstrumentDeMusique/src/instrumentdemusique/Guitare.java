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
public class Guitare extends InstrumentACorde {

    private String modele;

    public Guitare() {                                                      //Constructeur par defaut Guitare
        super();
        System.out.println("constructeur défaut Guitare");
    }

    public Guitare(String modele,int nombreDeCorde,String nom) {          //Constructeur par parametre Guitare
        super(nombreDeCorde, nom);
        this.modele = modele;
        System.out.println("Constructeur par paramètres Guitare");
    }

    public Guitare(Guitare g) {                                    //Constructeur par copie Guitare
        super(g);
        this.modele = g.modele;
        System.out.println("Constructeur copie Guitare");
    }

    public void afficher() {                                         //afficher
        super.afficher();
        System.out.println("Guitare : " + modele);
    }

    @Override
    public String toString() {
        return "Guitare{" + "modele=" + modele + '}';
    }
    
    /**
 * @param args the command line arguments
 */

public static void main(String[] args) {
        
        Guitare c1;
        
        c1 = new Guitare("Fender",5,"guitare");
       // System.out.println(c1);
        c1.afficher();

    }
}