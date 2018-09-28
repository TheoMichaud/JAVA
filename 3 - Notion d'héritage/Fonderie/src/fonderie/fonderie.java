/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonderie;

/**
 *
 * @author tmichaud
 */
public class fonderie {
     public static void main(String[] args) {
        // TODO code application logic here

        BarreRonde barreUne;
        double masseRonde;
        BarreCarree barreDeux;
        double masseCarree;
        BarreRectangle barreTrois;
        double masseRectangle;

        barreUne = new BarreRonde(2, 8.5, 2, "JQHDVE332");
        barreDeux = new BarreCarree(2, 8.5, 2, "VQRBHB556");
        barreTrois = new BarreRectangle(2, 4, 8.5, 2, "SPFIDJ320");
        masseRonde = barreUne.calculerMasse();
        masseCarree = barreDeux.calculerMasse();
        masseRectangle = barreTrois.calculerMasse();

        barreUne.afficherReference();
        System.out.println("Masse barre ronde : " + masseRonde);
        barreDeux.afficherReference();
        System.out.println("Masse barre carree : " + masseCarree);
        barreTrois.afficherReference();
        System.out.println("Masse barre rectangle : " + masseRectangle);
    }

}
