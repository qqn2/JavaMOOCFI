import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
     int read2 = Integer.parseInt(reader.nextLine());
int fact=1;
        for (int i = 1; i <=read2; i++) {
            fact*=i;
        }
        System.out.println("Sum is" +fact);
    }
}
