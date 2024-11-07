import java.util.Scanner;

public class Meny {


    public void menu(Catalog catalog){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add product");
            System.out.println("2. Show catalog");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    catalog.addProduct(scanner);
                    break;
                case 2:
                    catalog.showProduct();
                    break;
                case 3:
                    System.out.println("Exit program");
                    return;
                default:
                System.out.println("Try again");

            }
        }
    }

}
