
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samy
 */
public class Storehouse {

    private Map<String, Integer> listOfProducts = new HashMap<String, Integer>();
    private Map<String, Integer> listOfStock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        listOfProducts.put(product, price);
        listOfStock.put(product, stock);
    }

    public Map<String, Integer> getListOfProducts() {
        return listOfProducts;
    }
    
    

    public int price(String product) {
        if (listOfProducts.containsKey(product)) {
            return listOfProducts.get(product);
        } else {
            return -99;
        }

    }

    public int stock(String product) {
        if (listOfStock.containsKey(product)) {
            return listOfStock.get(product);

        }
        return 0;
    }

    public boolean take(String product) {
        int initialStock = stock(product);
        if (initialStock > 0) {
            initialStock--;
            listOfStock.put(product, initialStock);
            return true;
        }
        else
            return false;
    }
    public Set<String> products() {
        return listOfProducts.keySet();
        
    }

}
