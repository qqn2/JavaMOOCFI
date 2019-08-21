/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author samy
 */
public class Item implements Thing, Comparable<Item> {
    private String itemName;
    private int volume;

    public Item(String itemName, int volume) {
        this.itemName = itemName;
        this.volume = volume;
    }

    public String getName() {
        return itemName;
    }
    
    
    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
    return this.itemName + " (" + getVolume() + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return this.volume - o.getVolume();
    
    }
    
    
    
}
