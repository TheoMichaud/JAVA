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
public class Geometrique {
    
       
    public static void main(String[] args) { 
        Point p1, p2, p3, p4,p5;
        p1 = new Point();
        p2 = new Point(1.0, 2.1);
        p3 = new Point(p2);
        p4 = p1;
        p5=new Point(p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        
        System.out.println(" ");
        p2.translate(5, 5);
        p5.translate(5, 5);
        System.out.println(p2);
        System.out.println(p5);
        
        Trait t1;
        Carre c1;
        Cercle cercle1;
        p1 = new Point();
        p2 = new Point(1.0, 2.1);
        t1 = new Trait(p1, p2, 2, false);
        c1 = new Carre(5);
        cercle1 = new Cercle(p1, 5);
       
        System.out.println(c1.calculerAireCarre());
        System.out.println(cercle1.calculerAire());
        System.out.println(t1);
        
    }
 
        
}
