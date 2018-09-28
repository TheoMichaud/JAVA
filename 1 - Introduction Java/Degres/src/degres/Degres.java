/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degres;
import java.util.Scanner;

/**
 *
 * @author tmichaud
 */
public class Degres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Fahrenheit,Celsius;
        
        System.out.print("La température en Fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        Fahrenheit = sc.nextInt();
        
        Celsius = (5.0/9.0)*(Fahrenheit-32.0);
        System.out.print("La température en Degrès est de : "+Celsius+"°");
    }
    
}
