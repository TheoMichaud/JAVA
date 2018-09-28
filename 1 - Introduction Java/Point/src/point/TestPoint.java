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
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point p1,p2;
        p1 = new Point();
        p1.translater(10.0, 20.1);
        p2 = new Point();
        p2.translater(3, 6);
        
        //System.out.println("point 1 : "+p1.x+" "+p1.y);
        //System.out.println("point 2 : "+p2.x+" "+p2.y);
        
        p1.afficher();
        p2.afficher();
        
        System.out.println(p1);
        Point p3;
        Point p4;
        p3=new Point(5.5,6.6);
        p3.afficher();
        p4=new Point();
        p4.afficher();
    }

}
