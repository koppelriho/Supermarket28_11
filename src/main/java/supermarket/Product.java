package supermarket;

public class Product {
    public String name;
    public int quantity;
    public String description;
    public float price;

    public Product(String name, int quantity, String description, float price){
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    public String toString(){
        return "Name : " + name + " Quantity: " + quantity + " Description: " + description + " Price: " + price;
    }
}
