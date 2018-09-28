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
public class TableDe16 {
    public static void main(String[] args) {
        int i;
        int multiplicateur;
        Scanner sc=new Scanner(System.in);
        System.out.println("Donnez le multiplicateur :");
        multiplicateur=sc.nextInt();
                
        for(i=1; i<11; i++) 
        {
        System.out.println(multiplicateur+" x "+i+" = "+i*multiplicateur);
        }
    }
}
