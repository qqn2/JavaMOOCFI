
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner Clavier = new Scanner(System.in);
    String name = "default";
    String studentnumber = "def";
    Student test = new Student(name, studentnumber);
    while(!name.isEmpty()){
        System.out.print("name : ");name = Clavier.nextLine();
        if(name.isEmpty()) break;
        System.out.print("studentnumber : ");studentnumber = Clavier.nextLine();
        test = new Student(name, studentnumber);
        list.add(test);
    }
        for (Student student : list) {
            System.out.println(student.toString());
            
        }
        String search ="";
        System.out.println("Give search term:" ); search = Clavier.nextLine();
        System.out.println("Result:");
        for (Student student : list) {
            
            if(student.getName().contains(search))
                System.out.println(student.toString());
            
            
        }
    
    }
}
