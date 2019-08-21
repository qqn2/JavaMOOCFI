/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String nameStart, double priceStart, int amountStart) {
        this.name=nameStart;
        this.price=priceStart;
        this.amount=amountStart;
    }
    
    public void printProduct(){
        System.out.println(this.name + " , price " + this.price + ", amount " + this.amount);
        
    }
    
   
    
    
}
