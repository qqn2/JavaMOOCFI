/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package td8;

public class B extends A {

    protected int b = 7686;

    public B(int b) {
        super(2 * b);
            a = b;
    }

    @Override
    public void afficherClasse() {
        super.afficherClasse();
        System.out.println("Classe B");
    }

    @Override
    public void afficherVariables() {
        super.afficherVariables();
        System.out.println("b = " + b);
    }
}
