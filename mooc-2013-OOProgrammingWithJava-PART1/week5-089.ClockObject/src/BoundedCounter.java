/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
       this.upperLimit=upperLimit;
       this.value=0;// write code here
    }

    public void next() {
        if(this.value < this.upperLimit)
        this.value++;
        else
        this.value=0;
        // write code here
    }
    public int getValue() {
    // write here code that returns the value
    return this.value;
}
    public void setValue(int v) {
    if(v>=0 && v < this.upperLimit + 1)
        this.value=v;
    }
    @Override
    public String toString() {
        if(this.value < 10)
        return "0" + this.value+ "" ;
        else
        return this.value+ "" ; 
    }
}
    