/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td9;

/**
 *
 * @author samy
 */
public class Carre extends Rectangle {

    public Carre(double largeur, String nomDeLobjet) {
        super(largeur, largeur, nomDeLobjet);
        
    }
    public String getType() {
        return "Carre";
    }

    public double getSurface(){
        return this.largeur*this.largeur;
    }
    
}
