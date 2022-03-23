package c09_quan_ly_dien_thoai.controllers;

import c09_quan_ly_dien_thoai.services.impl.PhoneServiceImpl;
import c09_quan_ly_dien_thoai.utils.NotFoundProductException;

import java.util.Scanner;

public class PhonesController {
    Scanner scanner = new Scanner(System.in);
    PhoneServiceImpl phoneService = new PhoneServiceImpl();

    public void displayMainPhonesMenu() {
        int choice = -1;
        do {
            System.out.println("PHONES MANAGEMENT SYSTEM\n" +
                    "1. Add a phone\n" +
                    "2. Delete a phone\n" +
                    "3. Display phones list\n" +
                    "4. Searching phones\n" +
                    "0. Exit\n" +
                    "(Please choose a number for accessing to these functions).");
            System.out.print("Enter your number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        phoneService.add();
                        break;
                    case 2:
                        phoneService.delete();
                        break;
                    case 3:
                        phoneService.display();
                        break;
                    case 4:
                        phoneService.search();
                        break;
//                    case 5:
//                        System.out.println("PROMOTION MANAGEMENT");
//                        System.out.println("1.\tDisplay list customers use service\n" +
//                                "2.\tDisplay list customers get voucher\n" +
//                                "3.\tReturn main menu\n");
//                        break;
//                    case 0:
//                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Wrong format, only NUMBER accepted, please type again: ");
            } catch (NotFoundProductException e) {
                System.out.println(e.getMessage());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } while (true);
    }
}