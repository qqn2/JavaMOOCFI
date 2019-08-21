
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class PromissoryNote {


    private HashMap<String,Double> list;

    public PromissoryNote() {
         this.list = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
       
        list.put(toWhom, value);
        
    }

    public double howMuchIsTheDebt(String whose){
         if (this.list.containsKey(whose))
        return list.get(whose);
         else 
             return 0;
    
    }
    
}
