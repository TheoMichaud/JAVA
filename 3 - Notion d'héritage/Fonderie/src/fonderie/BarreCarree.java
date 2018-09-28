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
public class BarreCarree extends Barre {
        private double cote;

    //Constructeur par defaut
    public BarreCarree() {
    }

    //Constructeur avec parametres
    public BarreCarree(double cote, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.cote = cote;
        System.out.println("Constructeur 'BarreCarree' avec paramètres\n");
    }

    //Constructeur avec copie
    public BarreCarree(BarreCarree maBarre) {
        super(maBarre.densite, maBarre.longueur, maBarre.reference);
        this.cote = maBarre.cote;
        System.out.println("Constructeur 'BarreCarree' avec paramètres\n");
    }

    public double calculerSection() {
        double section;
        section = cote * cote;
        return section;
    }

    public double calculerMasse() {
        double masse, section;
        section = calculerSection();
        masse = longueur * section * densite;
        return masse;
    }
}
