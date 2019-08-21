
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            printMultipleStar(array[i]);
            
        }
        // write code here
    }
    public static void printOneStar (){
        System.out.print("*");
    }
    public static void printMultipleStar (int t){
        for (int i = 0; i < t; i++) {
            printOneStar();
        }
        System.out.println("");
    }
}
