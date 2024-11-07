public class Main {
    public static void main(String[] args){
        Catalog catalog = new Catalog();
        catalog.generateCatalog();
        Meny meny = new Meny();
        meny.menu(catalog);

    }

}