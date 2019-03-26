/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String initialName, double initialPrice, int initialAmount){
        this.name = initialName;
        this.price = initialPrice;
        this.amount = initialAmount;
        
    }
    public void printProduct(){
        System.out.print(this.name);
        System.out.print("price " + this.price);
        System.out.println(", amount " + this.amount);
    }
    
    
    
    
    
}
