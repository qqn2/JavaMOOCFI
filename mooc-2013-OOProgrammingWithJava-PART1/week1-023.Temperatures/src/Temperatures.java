
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.print("enter number:");    
        double number = Double.parseDouble(reader.nextLine());
        if (number <= 40 && number >= -30 )
        Graph.addNumber(number);
        
        }
        // Graph is used as follows:
      
        // Remove or comment out these lines above before trying to run the tests.
    }
}
