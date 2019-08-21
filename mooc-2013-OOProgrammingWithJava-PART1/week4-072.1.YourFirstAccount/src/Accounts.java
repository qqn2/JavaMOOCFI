
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account samAccount = new Account("sam", 100.0);
        System.out.println("Initial state");
System.out.println(samAccount);
        samAccount.deposit(20.0);
        System.out.println(samAccount);
    }

}
