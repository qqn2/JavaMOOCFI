/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td9;

/**
 *
 * @author rekiouas
 */
public class Rectangle extends Forme {
    protected double longeur;
    protected double largeur;

    public Rectangle(double longeur, double largeur, String nomDeLobjet) {
        super(nomDeLobjet);
        this.longeur = longeur;
        this.largeur = largeur;
    }
    
    
     public String getType() {
        return "Rectangle";
    }

    public double getSurface(){
        return this.largeur*this.longeur;
    }
    
    
    
}
