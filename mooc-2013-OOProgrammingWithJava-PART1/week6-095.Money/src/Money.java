
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        if (cents < 0){
            euros -= (100-cents)/ 100;
            cents =(100+cents) % 100;
        }
        if (euros < 0 ){
            euros=0;cents=0;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        Money sum = new Money(this.euros + added.euros, this.cents + added.cents);
        return sum;
    }

    public boolean less(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        } else return this.euros == compared.euros && this.cents < compared.cents;
        
//         else if (this.euros == compared.euros && this.cents < compared.cents) {
//            return true;
//        } else {
//            return false;
//        }
    }
    public Money minus(Money decremented){
        Money sum = new Money(this.euros - decremented.euros, this.cents - decremented.cents);
        return sum;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
