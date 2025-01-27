
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int i=0;
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
        boolean c=true;
        while (lowerLimit != upperLimit || i!=maxQuestions) {
          c = isGreaterThan(average(upperLimit, lowerLimit));
            if (c) {
                
                lowerLimit = average(upperLimit, lowerLimit) + 1;
                System.out.println("lower : " +lowerLimit);
                System.out.println("upp : " + upperLimit);
            } else {
                upperLimit = average(upperLimit, lowerLimit);
                System.out.println("lower : " +lowerLimit);
                System.out.println("upp : " + upperLimit);
            }
            i++;
            if(lowerLimit == upperLimit )
                break;
            
        }
        System.out.println("The number you're thinking of is " +(lowerLimit));

        // write the guessing logic here
    }

    // implement here the methods isGreaterThan and average
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " +value+ " ? (y/n)");
        char input = reader.next().charAt(0);;
        return input == 'y';
    }

    public int average(int firstNumber, int secondNumber) {
        return (int) ( (double) firstNumber + secondNumber) / 2;
    }

}
