/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td9;
import java.lang.Math;

/**
 *
 * @author rekiouas
 */
public class Cercle extends Forme {
    protected double rayon;

    public Cercle(double rayon, String nomDeLobjet) {
        super(nomDeLobjet);
        this.rayon = rayon;
    }
     
    
    
     public String getType() {
        return "Cercle";
    }

    public double getSurface(){
        return this.rayon*this.rayon*Math.PI;
    }
    
}
