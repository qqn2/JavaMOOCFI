package td8;

public class A {

    protected int a = 1111;

    public A(int a) {
        this.a = a;
    }

    public void afficherClasse() {
        System.out.println("Classe A");
    }

    public void afficherVariables() {
        System.out.println("a = " + a);
    }
}
