/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Person {
    private String Name;
    private String Number;

    public Person(String Name, String Number) {
        this.Name = Name;
        this.Number = Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNumber() {
        return Number;
    }

    public void changeNumber(String Number) {
        this.Number = Number;
    }

    @Override
    public String toString() {
        return this.getName() + " number: " + this.getNumber(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
