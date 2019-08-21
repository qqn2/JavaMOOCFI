
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what ?");
        int sum=0;
        int read = Integer.parseInt(reader.nextLine());
        int read2 = Integer.parseInt(reader.nextLine());

        for (int i = read; i <=read2; i++) {
            sum+=i;
        }
        System.out.println("Sum is" +sum);
    }
}
