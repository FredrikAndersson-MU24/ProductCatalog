import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    ArrayList<Product> products = new ArrayList<>();

    public void generateCatalog() {

      products.add(new Product("apple", 2.5));
      products.add(new Product("banana", 3.0));

        }
        public void showProduct(){
            for(Product product : products){
                System.out.println(product);
            }
        }

        public void addProduct(Scanner scanner){
            System.out.println("Enter product name: ");
            String name = scanner.nextLine();
            System.out.println("Enter product price: ");
            double price = scanner.nextDouble();
            products.add(new Product(name, price));
            showProduct();
        }

        

}
