
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
          System.out.print("Type the radius: ");
          int rad = Integer.parseInt(reader.nextLine());
          double cir = 2 * Math.PI * rad;
          System.out.println("Circumference of the circle: " +cir);
        // Program your solution here 
    }
}
