/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author samy
 */
public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> whatsinthebox = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (this.maximumCapacity >= this.getVolume() + thing.getVolume()) {
            whatsinthebox.add(thing);
            return true;
        }
            return false;
    }

    @Override
    public int getVolume() {
        int sum = 0;
        for (Thing object : whatsinthebox) {
            sum += object.getVolume();
        }
        return sum;
    }

}
