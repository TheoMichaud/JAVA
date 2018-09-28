/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author tmichaud
 */
public class Rationnel {
    int num,den;
    
    public Rationnel(){
        
    }
    
    public Rationnel(int n, int d){
        this.num=n;
        this.den=d;
    }
    
    Rationnel calculerProduit(Rationnel r){
        Rationnel produit;
        int n,d;
        n=num*r.num;
        d=den*r.den;
        produit=new Rationnel(n,d);        
        return produit;
    }
    
    Rationnel calculerSomme(Rationnel r){
        Rationnel somme;
        int n,d;
        n= (num*r.den)+(r.num*den);
        d= den*r.den;
        somme = new Rationnel(n,d);
        return somme;
    }

    Rationnel calculerQuotient(Rationnel r){
        Rationnel quotient;
        int n,d;
        n= num*r.den;
        d= den*r.num;
        quotient = new Rationnel(n,d);
        return quotient;
    }
    
    boolean estPlusGrand(Rationnel r){
        int a=num*r.den;
        int b=r.num*den;
        boolean retour;
        if(a>b){
            retour=true;
        }
        else{
            retour=false;
        }
        return retour;
    }
    
    @Override
    public String toString() {
        return "Rationnel{" + num + "/" + den + '}';
    }

    
}
