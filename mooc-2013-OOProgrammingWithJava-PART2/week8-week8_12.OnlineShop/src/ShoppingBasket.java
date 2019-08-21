
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samy
 */
public class ShoppingBasket {

    private Map<String, Purchase> list = new HashMap<String, Purchase>();
    
    public void add(String product, int price) {
        Purchase achat = new Purchase(product, 1, price);
        if(!list.containsKey(product))
        list.put(product, achat);
        
        else {
            list.get(product).increaseAmount();
             }
    
    }

    public int price() {
        int sum = 0;
        for (Purchase purchase : list.values()) {
            sum += purchase.price();

        }
        return sum;
    }

    public void print() {
        for (Purchase purchase : list.values()) {
            System.out.println(purchase.toString());
        }
    }

}
