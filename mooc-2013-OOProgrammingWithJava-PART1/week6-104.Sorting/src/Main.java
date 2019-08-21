
public class Main {
    public static void main(String[] args) {
       int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array) {
       int small=Integer.MAX_VALUE;
        for (int i : array) {
            if (i < small)
                small=i;
        }
        return small;
    }
    public static int indexOfTheSmallest(int[] array) {
     int index=0;
     int small=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small){
                index=i;
                small=array[i];
                        }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int inde) {
    int index=0;
     int small=Integer.MAX_VALUE;
        for (int i = inde; i < array.length; i++) {
            if (array[i] < small){
                index=i;
                small=array[i];
                        }
        }
        return index;
}
    public static void swap(int[] array, int index1, int index2) {
    int swap;
    swap=array[index1];
    array[index1]=array[index2];
    array[index2]=swap;
}
    public static void sort(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
                    swap(array, i, indexOfTheSmallestStartingFrom(array, i));
                    for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j]);
                    if ((j!=array.length-1))
                        System.out.print(", ");}
        }
        System.out.println("]");
        
}
  
  
    
    
    
}
  































