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
public class Point {

    private double x;
    private double y;

    public Point() {
    }
    

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }
    void translater(double dx, double dy) {
        x += dx;
        y += dy;
    }

    double distance() {
        double dist;
        dist = Math.sqrt(x * x + y * y);
        return dist;
    }
    
    void afficher(){
        System.out.println("x : "+x+" y : "+y);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

}







































