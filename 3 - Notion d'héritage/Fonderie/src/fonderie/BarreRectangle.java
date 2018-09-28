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
public class BarreRectangle extends Barre {
    double hauteur;
    double largeur;

    //Constructeur par defaut
    public BarreRectangle() {
    }

    //Constructeur avec paramètres
    public BarreRectangle(double hauteur, double largeur, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.hauteur = hauteur;
        this.largeur = largeur;
        System.out.println("Constructeur 'BarreRectangle' avec paramètres\n");
    }

    //Constructeur avec copie
    public BarreRectangle(BarreRectangle maBarre) {
        super(maBarre.densite, maBarre.longueur, maBarre.reference);
        this.hauteur = maBarre.hauteur;
        this.largeur = maBarre.largeur;
        System.out.println("Constructeur 'BarreRectangle' avec paramètres\n");
    }

    public double calculerSection() {
        double section;
        section = hauteur * largeur;
        return section;
    }

    public double calculerMasse() {
        double masse, section;
        section = calculerSection();
        masse = longueur * section * densite;
        return masse;
    }
}
