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
public class Trait {
 private Point debut;
    private Point fin;
    private double epaisseur;
    private boolean pointille;

    public Trait() {
    }

    public Trait(Point debut, Point fin, double epaisseur, boolean pointille) {
        this.debut = debut;
        this.fin = fin;
        this.epaisseur = epaisseur;
        this.pointille = pointille;
    }

    public Trait(Trait t) {
        this.debut = t.debut;
        this.fin = t.fin;
        this.epaisseur = t.epaisseur;
        this.pointille = t.pointille;
    }

    double calculLongueur() {
        double longueur;
        longueur = debut.calculerDistancePoint(fin);
        return longueur;
    }

    void afficherLongueur(String nom) {
        System.out.println("La longueur du trait" + nom + "est de" + calculLongueur());
    }

    @Override
    public String toString() {
        return "Trait{" + "debut=" + debut + ", fin=" + fin + ", epaisseur=" + epaisseur + ", pointille=" + pointille + '}';
    }
}
