
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           String input = reader.next();
           System.out.println("Length :" +calculateCharacters(input));
        // call your method from here
    }
    
     public static int calculateCharacters(String text){
         
         return text.length();
     }
    
}
