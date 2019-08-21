
public class Main {

    public static void main(String[] args) {
       int cells = 99;
int[] array = new int[cells]; //creating an array of the size of the value in the 'cells' variable

if(array.length == cells) {
    System.out.println("The length of the array is " + cells);
} else {
    System.out.println("Something unreal happened. The length of the array is something else than " + cells);
}
}
}
