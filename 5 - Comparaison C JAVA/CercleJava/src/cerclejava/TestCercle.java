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
public class TestCercle {
    
    public static void main(String[] args) {
        
        Cercle c1;
        Cercle c2;
        c1=new Cercle(3,5,10); // un cercle en (3,5) rayon 10
        c2=new Cercle(-2,4,3); // un cercle en (-2,4) rayon 3
        c1.afficherCercle();
        c2.afficherCercle();
        c1.deplacerCercle(1,2); // le cercle c1 est a present en (1,2)
        c1.afficherCercle();
        c2.changerRayonCercle(6);   // le cercle c2 a un nouveau rayon de 6
        c2.afficherCercle();
    
        System.out.println("perimetre cercle 2 : "+c2.calculerPerimetre());

    
    }
    
}
