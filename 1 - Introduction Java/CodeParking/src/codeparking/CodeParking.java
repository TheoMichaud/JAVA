/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeparking;
import java.util.Scanner;

/**
 *
 * @author tmichaud
 */
public class CodeParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String codeSecret="4512";
   String codeSaisi="";
   int i;
   Scanner lectureCode = new Scanner(System.in);
   System.out.print("Veuillez saisir un code à 4 chiffres :");
   codeSaisi=lectureCode.nextLine();
   while (codeSaisi.length() !=4) {                     //Boucle pour obliger à saisir 4 chiffres//
       System.out.println("\nLe nombre de chiffres saisi est incorrect! ");
       System.out.print("Veuillez saisir un code à 4 chiffres : ");
       codeSaisi=lectureCode.nextLine();
   }
   
   do{
       
   
   if(codeSaisi.equals(codeSecret))
   {System.out.println("\nLe code saisi est bon \n");
   }
   else
   { System.out.println("\nLe code saisi est incorrect!\n ");
       
   }
   lectureCode.close();
       
   }while (codeSaisi.length() > codeSecret.length());
        
        
    }
    
}
