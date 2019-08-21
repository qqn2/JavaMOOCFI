
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Counter {

    private int x;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.x = startingValue;
        this.check = check;

    }

    public Counter(int StartingValue) {
        this(StartingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.x;
    }

    public void increase() {
        this.x++;
    }
    public void increase(int increaseAmount) {
        if (increaseAmount > 0)
            this.x+=increaseAmount;
    }
    public void decrease() {
        if (this.check)
        {  if (this.x > 0 )
                 this.x--;
        }
        else    
            this.x--;
    }
     public void decrease(int decreaseAmount) {
       
       if ( decreaseAmount > 0){  
         if (this.check )
        {  if ( this.x > decreaseAmount)
            this.x-=decreaseAmount;
        else    
            this.x=0;
        
        }
           else    
           this.x-=decreaseAmount;
       }
    }

}
