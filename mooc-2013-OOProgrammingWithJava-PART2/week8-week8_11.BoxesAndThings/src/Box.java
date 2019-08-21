
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> list = new ArrayList<ToBeStored>();

    public Box (double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored object){
        
        if(this.weight() + object.weight() <= this.maxWeight)
            list.add(object);
        
    }
    
    public double weight() {
        double weight = 0;
        for (ToBeStored obj : list) {
            weight+=obj.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
         return "Box: " + list.size() + " things, total weight " + this.weight() + " kg"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
