/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonderie;

/**
 *
 * @author tmichaud
 */
public class Barre {
    protected double densite;
    protected double longueur;
    protected String reference;

    //Constructeur avec paramètres
    public Barre(double densite, double longueur, String reference) {
        System.out.println("Constructeur 'Barre' avec paramètres");
        this.densite = densite;
        this.longueur = longueur;
        this.reference = reference;
    }

    //Constructeur par defaut
    public Barre() {
    }

    //Constructeur avec copie
    public Barre(Barre maBarre) {
        System.out.println("Constructeur 'Barre' avec paramètres");
        this.densite = maBarre.densite;
        this.longueur = maBarre.longueur;
        this.reference = maBarre.reference;
    }

    public void afficherReference() {
        System.out.println("Reference : " + reference);
    }
}
