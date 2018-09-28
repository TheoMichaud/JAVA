/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerclejava;

/**
 *
 * @author tmichaud
 */
public class Cercle {
    //atributs
    private double x;
    private double y;
    private double rayon;
    
    //constructeurs
    public Cercle() {
    }
    
    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        System.out.println("Constructeur 'Cercle' avec paramètres\n");
    }
    
    public Cercle(Cercle c) {
        this.x = c.x;
        this.y = c.y;
        this.rayon = c.rayon;
        System.out.println("Constructeur 'Cercle' copie\n");
    }
        
    //methodes

    void deplacerCercle(double nouveauX, double nouveauY)
    {
        this.x = nouveauX;
        this.y = nouveauY;
    }
    
    void changerRayonCercle(double nouveauRayon)
    {
        this.rayon = nouveauRayon;
    }
    void afficherCercle()
    {
        System.out.println("("+this.x+","+this.y+") rayon : "+this.rayon);
    }

    double calculerPerimetre()
    {
        double perimetre;
        perimetre = 2 * Math.PI * this.rayon;
        return perimetre;
    }
    
    
}
