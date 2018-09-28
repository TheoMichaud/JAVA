/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle1;
import java.util.Scanner;
/**
 *
 * @author tmichaud
 */
public class Triangle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int nbLignes, ligneCourante = 1, i = 0;

        System.out.println("Nb lignes : ");
        Scanner sc = new Scanner(System.in);
        nbLignes = sc.nextInt();

        while (ligneCourante <= nbLignes) {
            while (i < ligneCourante) {
                System.out.print("*");
                i++;
            }
            System.out.println("\r");
            ligneCourante++;
            i = 0;
        }
    }
    
}
