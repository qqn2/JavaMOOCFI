
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what ?");
        int sum=0;
        int read = Integer.parseInt(reader.nextLine());
        for (int i = 0; i <=read; i++) {
            sum+=i;
        }
        System.out.println("Sum is" +sum);
    }
}
