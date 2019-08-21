
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           System.out.print("Type a number:");
           int n1 = Integer.parseInt(reader.nextLine());
           System.out.print("Type another number: ");
           int n2 = Integer.parseInt(reader.nextLine());
           
           int bigboy = n1 > n2  ?  n1 : n2;
           System.out.println("The bigger number of the two numbers given was:" +bigboy);
           
        // Implement your program here. Remember to ask the input from user
    }
}
