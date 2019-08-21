import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
       int grt = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer> grt)
                grt=integer;
            
        }
        return grt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
