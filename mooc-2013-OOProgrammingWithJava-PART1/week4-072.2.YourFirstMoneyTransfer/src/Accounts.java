
public class Accounts {

    public static void main(String[] args) {
        Account Matt_acc = new Account("Matt's account", 1000.0);
        Account My_acc = new Account("My account", 0.0);
        Matt_acc.withdrawal(100.0);
        My_acc.deposit(100.0);
        System.out.println(Matt_acc);
        System.out.println(My_acc);
    }

}
