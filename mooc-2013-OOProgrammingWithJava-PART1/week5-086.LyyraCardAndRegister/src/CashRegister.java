
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this(1000,0,0);
    }

    

    public CashRegister(double cashInRegister, int economicalSold, int gourmetSold) {
        this.cashInRegister = cashInRegister;
        this.economicalSold = economicalSold;
        this.gourmetSold = gourmetSold;
    }
    

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5){
            this.cashInRegister+=2.5;
            this.economicalSold++;
            return cashGiven-2.5;
        }
        else
            return cashGiven;
      
    }

    public double payGourmet(double cashGiven) {
         if (cashGiven >= 4){
            this.cashInRegister+=4;
            this.gourmetSold++;
            return cashGiven-4;
        }
        else
            return cashGiven;
      
    }
    public boolean payEconomical(LyyraCard card) {
        if (card.getBalance() >=2.5) {
             card.setBalance(card.getBalance()-2.5);
            this.economicalSold++;
            return true;
        }
        else
        
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
       if (card.getBalance() >=4) {
           
             card.setBalance(card.getBalance()-4);
            this.gourmetSold++;
            return true;
        }
        else
        
        return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
       if (sum >=0) {
           card.setBalance(card.getBalance()+sum);
           this.cashInRegister+=sum;
       } 
    }
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
