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
public abstract class Forme implements Comparaison {
    private String nomDeLobjet;

    public Forme(String nomDeLobjet) {
        this.nomDeLobjet = nomDeLobjet;
    }
    
    public abstract String getType();
    public abstract double getSurface();

    public String getNomDeLobjet() {
        return nomDeLobjet;
    }

    public void setNomDeLobjet(String nomDeLobjet) {
        this.nomDeLobjet = nomDeLobjet;
    }

    @Override
    public String toString() {
        return "L'objet " + getNomDeLobjet() + " est de type " + getType() + " et sa surface est " +getSurface();
    }
    
    public double compare(){
        return getSurface();
    }
    
    
}
