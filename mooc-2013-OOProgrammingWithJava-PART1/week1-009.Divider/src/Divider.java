
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

           System.out.print("Type a number: ");
           int number = Integer.parseInt(reader.nextLine());

           
           System.out.print("Type another number: ");
           int number2 = Integer.parseInt(reader.nextLine());

           double divider = (double)number / number2;
           System.out.println("");
            System.out.println("Division: " +number+ " / " +number2+ " = " +divider );
        // Implement your program here. Remember to ask the input from user.
    }
}
