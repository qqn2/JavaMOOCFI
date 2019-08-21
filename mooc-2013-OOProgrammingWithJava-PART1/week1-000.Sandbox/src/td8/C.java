/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package td8;


public class C extends B {

    protected int b = 7;
    protected int c = 8888888;

    public C(int c) {
        super(3 * c);
        b = c;
    }

    @Override
    public void afficherClasse() {
        super.afficherClasse();
        System.out.println("Classe C");
    }

    @Override
    public void afficherVariables() {
        super.afficherVariables();
        System.out.println("c = " + c);
    }
}
