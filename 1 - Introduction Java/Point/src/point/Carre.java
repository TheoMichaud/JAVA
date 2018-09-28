/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author phabert
 */
public class Carre {
    private double cote;
    public Carre() { //Constructeur par defaut
    }

    public Carre(double cote) { 
        this.cote = cote;
    } 
    
    double calculPerimetre(){
        double perimetre = cote*4;
        return perimetre;
    }
    void afficherPerimetre()
    {
        System.out.println("Perimetre : "+calculPerimetre());
    }
    
    
    double calculAire(){
        double aire = cote*cote;
        return aire;
        
    }
    void afficherAire()
    {
        System.out.println("Aire = "+calculAire());
    }
    
    
}