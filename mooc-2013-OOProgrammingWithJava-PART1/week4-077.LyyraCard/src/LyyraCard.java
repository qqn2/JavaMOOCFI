/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4;
        }

    }

    public void loadMoney(double amount) {
        // write code here
        if(amount>0)
        this.balance+=amount;
        if(this.balance > 150)
            this.balance = 150;
        
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }
}
