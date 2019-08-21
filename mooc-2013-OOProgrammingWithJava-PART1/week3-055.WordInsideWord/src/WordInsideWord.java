
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String input1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String input2 = reader.nextLine();
        int tester = input1.indexOf(input2);
        if (tester == -1 )
            System.out.println("The word '" +input2 + "' is not found in the word '" +input1 +"'");
        else
           System.out.println("The word '" +input2 + "' is found in the word '" +input1 +"'");

    
    }
}
