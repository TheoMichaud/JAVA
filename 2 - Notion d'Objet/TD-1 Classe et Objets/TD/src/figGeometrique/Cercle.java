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
public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle() {
    }

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    double calculerAire() {
        double aire;
        aire = Math.PI * rayon * rayon;
        return aire;
    }

    void afficherAireCercle(String nom) {
        System.out.println("L'aire du cercle" + nom + "est de" + calculerAire());
    }
}
