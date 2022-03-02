package ss11_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add product");
            System.out.println("2. Edit product information by id ");
            System.out.println("3. Delete product by id");
            System.out.println("4. Display product information");
            System.out.println("5. Find product by name");
            System.out.println("6. Sort products by price");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.add();
                    break;
                case 2:
                    ProductManager.edit();
                    break;
                case 3:
                    ProductManager.delete();
                    break;
                case 4:
                    ProductManager.display();
                    break;
                case 5:
                    ProductManager.findProductByName();
                    break;
                case 6:
                    ProductManager.sortByPrice();
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}