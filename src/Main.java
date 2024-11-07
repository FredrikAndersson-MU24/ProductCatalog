import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add product");
            System.out.println("2. Add catalog");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product (name,price);
                    catalog.addProduct(product);
                    break;
                 case 2:
                     catalog.showProduct();
                     break;
                 case 3:
                     System.out.println("Exit program");
                     return;
                     System.out.println("Try again");

            }
        }
    }
}