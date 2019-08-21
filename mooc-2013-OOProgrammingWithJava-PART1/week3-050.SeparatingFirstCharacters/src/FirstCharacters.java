import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
         String input = reader.nextLine();
         if (input.length() < 3)
             return;
         else
             for (int i = 0; i < 3; i++) {
                 System.out.println( +(i+1) +". character : " +input.charAt(i));
             }
    }
     
}