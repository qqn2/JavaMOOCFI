import java.util.Random;

public class PasswordRandomizer {
    Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;// Initialize the variable
    }

    public String createPassword() {
int number;
char symbol;
String pass ="";
        for (int i = 0; i < this.length; i++) {
            number = random.nextInt(26);        
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            pass +=symbol;        
        }

        return pass;
    }
}
