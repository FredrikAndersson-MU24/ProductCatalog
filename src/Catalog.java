import java.util.ArrayList;

public class Catalog {

    ArrayList<Catalog> catalogList = new ArrayList<>();

    public void generateCatalog() {

  catalogList.add(new Catalog("apple", 2.5));
  catalogList.add(new Catalog("banana", 3.0));

    for(Catalog catalog : catalogList){
        System.out.println(catalog);
    }
            

    }


}
