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
public class TestCarre {
     public static void main(String[] args) {
  
    Carre c1;
        c1 = new Carre(10);
        
        
        //carre 1
        System.out.println("carré n°1 : ");
        c1.afficherAire();
        c1.afficherPerimetre();
        System.out.println("\n");
     }
}
