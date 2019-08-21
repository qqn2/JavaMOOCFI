import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         String input = reader.nextLine();
             for (int i = input.length()-1; i > -1 ; i--) {
                 System.out.print(""+input.charAt(i));
             }
    }
    }

