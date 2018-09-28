/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figGeometrique;

/**
 *
 * @author tmichaud
 */
public class Carre {
    private double cote;

    public Carre() {
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    double calculerAireCarre() {
        double aireCarre;
        aireCarre = cote * cote;
        return aireCarre;
    }

    void afficherAireCarre(String nom) {
        System.out.println("L'aire pour un carré de {" + cote + "}est de : " + calculerAireCarre());
    }
}
