public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers=0;
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
       this.amountOfNumbers++; // code here
       this.sum+=number;
    }
    

    public int amountOfNumbers() {
        return this.amountOfNumbers; // code here
    }

    public int sum() {
        
       return this.sum;
    }

    public double average() {
        if(this.amountOfNumbers!=0)
       return (double) sum()/this.amountOfNumbers;
        else
       return 0;
    }
}
    
 