
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text1 = reader.nextLine();
        System.out.print("Type your age: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String text2 = reader.nextLine();
        System.out.print("Type your age : ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("" + text1 + " and " + text2 + " are " + (number + number2) + " years old in total");

        // Implement your program here
    }
}
