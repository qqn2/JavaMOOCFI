
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
public class Container {

    private int maxlimit;
    private ArrayList<Suitcase> suit = new ArrayList<Suitcase>();

    public Container(int maxlimit) {
        this.maxlimit = maxlimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight() <= this.maxlimit)) {
            
            suit.add(suitcase);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Suitcase tot : suit) {
            sum += tot.totalWeight();
        }
        return sum;

    }
    public void printThings() {
        for (Suitcase suitcase : suit) {
            suitcase.printThings();
        }
        
    }

    @Override
    public String toString() {
        return suit.size() + " suitcases (" + this.totalWeight() + " kg)"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
