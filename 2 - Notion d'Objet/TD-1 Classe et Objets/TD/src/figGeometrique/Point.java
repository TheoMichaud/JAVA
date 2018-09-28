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
public class Point {
    
    private double x;
    private double y;

    public Point() {
        System.out.println("Constructeur de point par défaut");
    }

    public Point(double abs, double ord) {
        this.x = abs;
        this.y = ord;
        System.out.println("Constructeur de points ayant pour paramètres x & y");
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
        System.out.println("Constructeur de points ayant pour paramettre un objet de class Point");
    }

    void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    double distance() {
        double dist;
        dist = Math.sqrt(x * x + y * y);
        return dist;
    }

    double calculerDistancePoint(Point p1) {
        double dist;
        dist = Math.sqrt((p1.x - x) * (p1.x - x) + (p1.y - y) * (p1.y - y));
        return dist;
    }

    void afficher(String nom) {
        System.out.println("Les coordonnées du point" + nom + "sont en x : " + x + "en y : " + y);
        System.out.format("Les coordonnées du point %s sont x:%2.2f et en y :%2.2f\n", nom, x, y);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

}
