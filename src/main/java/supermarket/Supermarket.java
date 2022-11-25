package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Supermarket {

    public float revenue;
    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    Scanner floatScanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Adding new product!");

        System.out.println("Please enter product name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter product quantity: ");
        int quantity = intScanner.nextInt();

        System.out.println("Please enter product description: ");
        String description = scanner.nextLine();

        System.out.println("Please enter product price: ");
        float price = floatScanner.nextFloat();

        Product product = new Product(name, quantity, description, price);
        products.add(product);

        System.out.println("Product " + product.name + " added successfully!");
    }

    public void viewAllProducts() {
        System.out.println("Viewing all products: ");

        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void removeProduct() {
        System.out.println("Please enter the name of the product to be removed: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(name)) {
                products.remove(product);
                System.out.println(product.name + " has been removed!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void viewProduct() {
        System.out.println("Please enter the name of the product: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(name)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void buyAProduct() {
        System.out.println("Please enter the name of the product you want to buy: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(name)) {
                System.out.println("Please enter the quantity you wish to buy");
                int quantity = intScanner.nextInt();
                if (product.name.equalsIgnoreCase(name) && product.quantity >= quantity) {
                    System.out.println(product.name + " has been bought!");
                    product.quantity -= quantity;
                    revenue += (quantity * product.price);
                } else if (product.name.equalsIgnoreCase(name) && product.quantity < quantity) {
                    System.out.println("Out of stock");
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void showRevenue() {
        System.out.println("The revenue is " + revenue + "€.-");
    }

}

