import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void removeLast(ArrayList<String> list) {
   list.remove(countItems(list)-1);
    }
       public static int countItems(ArrayList<String> list) {
         return list.size();
         
     }
    

    public static void main(String[] args) {
        // Here an example what you can do with the method 
        ArrayList<String> persons = new ArrayList<String>();
      
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        // sort the persons
        Collections.sort(persons);

        // and remove the last
        removeLast(persons);

        System.out.println(persons);
    }
}
