
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read = Integer.parseInt(reader.nextLine());
        int fact=0;
                for (int i = 0; i <=read; i++) {
            fact+=(int)Math.pow(2, i);
        }
        System.out.println("Sum is " +fact);
        
    }
}
