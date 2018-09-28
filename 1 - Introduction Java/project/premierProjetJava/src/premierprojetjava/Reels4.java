/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premierprojetjava;
import java.util.Scanner;
/**
 *
 * @author phabert
 */
public class Reels4 {
    public static void main(String[] args) {
            float r1,r2,r3,r4;
            Scanner sc=new Scanner(System.in);
            System.out.print("r1 : ");
            r1=sc nextFloat();
            System.out.print("r2 : ");
            r2=sc nextFloat();
            System.out.print("r3 : ");
            r3=sc nextFloat();
            System.out.print("r4 : ");
            r4=sc nextFloat();
            System.out.println("somme :"+(r1+r2+r3+r4));
            System.out.println("produit :"+(r1*r2*r3*r4));
        }
        
        
    }
}
