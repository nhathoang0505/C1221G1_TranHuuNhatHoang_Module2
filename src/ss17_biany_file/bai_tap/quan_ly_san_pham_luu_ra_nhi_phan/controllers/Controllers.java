package ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.controllers;

import ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.services.ProductsServicesImpl;

import java.util.Scanner;

public class Controllers {
    Scanner scanner = new Scanner(System.in);
    ProductsServicesImpl productsServices = new ProductsServicesImpl();

    public void display() {
        int choice = -1;
        while (true) {
            System.out.println("PRODUCTS MANAGEMENT SYSTEM\n" +
                    "1. Add\n" +
                    "2. Display\n" +
                    "3. Search\n" +
                    "4. Exit\n" +
                    "(Please choose 1 to Add, 2 to Display, 3 to Search,\n" +
                    "4 to Exit program).");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productsServices.add();
                    break;
                case 2:
                    productsServices.display();
                    break;
                case 3:
                    System.out.println("Input the name of product you wanna search:");
                    productsServices.search(scanner.nextLine());
                    break;
                case 4:
                    System.exit(5);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
