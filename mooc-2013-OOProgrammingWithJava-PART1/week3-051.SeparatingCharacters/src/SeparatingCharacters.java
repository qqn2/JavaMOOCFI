
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         String input = reader.nextLine();
             for (int i = 0; i < input.length() ; i++) {
                 System.out.println( +(i+1) +". character : " +input.charAt(i));
             }
    }
}
