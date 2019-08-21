
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Brian :" + cardBrian);
        System.out.println("Pekka :" + cardPekka);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Brian :" + cardBrian);
        System.out.println("Pekka :" + cardPekka);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Brian :" + cardBrian);
        System.out.println("Pekka :" + cardPekka);
        // write code here
    }
}
    