
import java.util.Scanner;

public class Reader {
    private Scanner scan = new Scanner(System.in);

    public Reader() {
    }
    
    public String readString(){
        String com = scan.nextLine();
        return com;
    }
    public int readInteger(){
        return Integer.parseInt(this.readString());
    }
    
}
