/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

public class Product {
    private String name;
    private float price;

    public Product() {
        
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    
    public double getImportTax(){
        return price * 0.1;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
