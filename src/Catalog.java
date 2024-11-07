import java.util.ArrayList;

public class Catalog {

    ArrayList<Product> products = new ArrayList<>();

    public void generateCatalog() {

  products.add(new Product("apple", 2.5));
  products.add(new Product("banana", 3.0));

    for(Product product : products){
        System.out.println(product);
    }


    }


}
