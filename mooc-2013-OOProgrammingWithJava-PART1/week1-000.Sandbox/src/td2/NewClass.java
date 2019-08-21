/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

/**
 *
 * @author samy
 */
public class NewClass {
    private double x,y;

    public NewClass() {
    this(0,0);
    }

    public NewClass(double x, double y) {
        setCoo(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setCoo(double a, double b) {
        this.x = a;
        this.y = b;
    }
    public void affichage(){
        System.out.println("La position x est : "  +this.x);
        System.out.println("La position y est : "  +this.y);

    }
    
}
