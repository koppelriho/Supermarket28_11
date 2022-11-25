import supermarket.Supermarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the supermarket!");

        Scanner scanner = new Scanner(System.in);

        Supermarket supermarket = new Supermarket();


        String input;
        do {
            System.out.println("""
                    What would you like to do today?
                    
                    1. Add a product
                    2. View all products
                    3. Remove a product
                    4. View a single product
                    5. Buy a product
                    6. Track revenue
                    
                    """);
            input = scanner.nextLine();
            switch (input) {
                case "quit" -> System.out.println("Exiting application!!!");
                case "1" -> supermarket.addProduct();
                case "2" -> supermarket.viewAllProducts();
                case "3" -> supermarket.removeProduct();
                case "4" -> supermarket.viewProduct();
                case "5" -> supermarket.buyAProduct();
                case "6" -> supermarket.showRevenue();
                default -> System.out.println("Please input valid option");
            }
        }while (!input.equalsIgnoreCase("quit"));

    }
}
