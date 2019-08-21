
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A_person", 100.0);
        Account B = new Account("B_person", 0.0);
        Account C = new Account("C_person", 0.0);
        transfer(A, B, 50.0);
        transfer(B, C, 25.0);
    }
     public static void transfer(Account from,Account to, double HowMuch){
      from.withdrawal(HowMuch);
      to.deposit(HowMuch);
    }


}
