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
public class BarreRonde extends Barre{
    private double diametre;

    //Constructeur par defaut
    public BarreRonde() {
    }

    //Constructeur avec parametres
    public BarreRonde(double diametre, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.diametre = diametre;
        System.out.println("Constructeur 'BarreRonde' avec paramètres\n");
    }

    //Constructeur avec copie
    public BarreRonde(BarreRonde maBarre) {
        super(maBarre.densite, maBarre.longueur, maBarre.reference);
        this.diametre = maBarre.diametre;
        System.out.println("Constructeur 'BarreRonde' avec paramètres\n");
    }

    public double calculerSection() {
        double section;
        section = Math.PI * (diametre / 2) * (diametre / 2);
        return section;
    }

    public double calculerMasse() {
        double masse, section;
        section = calculerSection();
        masse = longueur * densite * section;
        return masse;
    }

}
