
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
public class Suitcase {

    private int limit;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int limit) {
        this.limit = limit;
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.limit) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }

    }

    public int totalWeight() {
        int sum = 0;
        for (Thing tot : things) {
            sum += tot.getWeight();
        }
        return sum;

    }

    public Thing heaviestThing() {
        Thing heavy = new Thing();
        
        if (things.isEmpty())
            return null;
        for (Thing thing : things) {
            if (heavy.getWeight() < thing.getWeight()) {
                heavy = thing;
            }
        }
        return heavy;
    }

    @Override
    public String toString() {
        if (!things.isEmpty() && things.size() != 1) {
            return things.size() + " things (" + this.totalWeight() + " kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + this.totalWeight() + " kg)";
        } else {
            return "empty (0 kg)";
        }
    }

}
