import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        System.out.println("First character : "+firstCharacter(input));
    }
     public static char firstCharacter(String text){
     return text.charAt(0);
     
     
     }
}
