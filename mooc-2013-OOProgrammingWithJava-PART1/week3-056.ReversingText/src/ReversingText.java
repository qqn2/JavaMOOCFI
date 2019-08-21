
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int legnth = text.length();
        String reverse = "";
        for (int i = legnth-1; i >= 0 ; i--) {
            reverse+=text.charAt(i);
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
