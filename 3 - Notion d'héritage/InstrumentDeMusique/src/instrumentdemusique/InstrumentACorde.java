/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentdemusique;

/**
 *
 * @author tmichaud
 */
public class InstrumentACorde extends InstrumentDeMusique{
    protected int nombreDeCorde;
    
    public InstrumentACorde(){
        super();
        System.out.println("Constructeur par default InstrumentACorde");
    }
    
    public InstrumentACorde(int nombreDeCorde,String nom){
        super(nom);
        this.nombreDeCorde=nombreDeCorde;
        System.out.println("Constructeur avec paramètre InstrumentACorde");
    }
    
    public InstrumentACorde(InstrumentACorde instrument){
        super(instrument);
        this.nombreDeCorde=instrument.nombreDeCorde;
        System.out.println("Constructeur copie InstrumentACorde");
    }
    
    public void afficher(){
        super.afficher();
        System.out.println("nb cordes : " +nombreDeCorde);
    }
/*
    @Override
    public String toString() {
        return "InstrumentACorde{" + "nombreDeCorde=" + nombreDeCorde + '}';
    }
*/
    
}
