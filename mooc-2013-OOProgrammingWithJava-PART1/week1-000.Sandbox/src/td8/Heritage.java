package td8;

public class Heritage {

    public static void main(String args[]) {
        A[] table = new A[3];
        table[0] = new A(1);
        table[1] = new B(2);
        table[2] = new C(3);

        for (int i = 0; i < table.length; i++) {
            table[i].afficherClasse();
            table[i].afficherVariables();
            System.out.println("-----");
        }
    }
}
