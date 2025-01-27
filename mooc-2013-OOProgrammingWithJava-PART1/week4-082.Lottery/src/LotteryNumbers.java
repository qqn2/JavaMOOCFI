import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random = new Random();
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
       
        
        
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
         int rng;
        while (this.numbers.size() < 7 ) {
            System.out.println(this.numbers.size());
            rng =  1+random.nextInt(39);
            if(!containsNumber(rng))
            this.numbers.add(rng);

        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
