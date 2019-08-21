/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    public void add(String name, String number)
    {
        Person buffer;
        buffer = new Person (name,number);
        list.add(buffer);
    }
    public void printAll(){
        for (Person person : list) {
            System.out.println(person.toString());
        }
        
    }
    public String searchNumber(String name){
        for (Person person : list) {
          if  (person.getName().equals(name))
              return person.getNumber();
        }
        
        return "number not known";
    }
}
