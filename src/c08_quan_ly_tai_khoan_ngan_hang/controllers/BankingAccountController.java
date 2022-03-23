package c08_quan_ly_tai_khoan_ngan_hang.controllers;

import c08_quan_ly_tai_khoan_ngan_hang.services.impl.AccountServiceImpl;
import c08_quan_ly_tai_khoan_ngan_hang.utils.NotFoundBankAccountException;

import java.util.Scanner;

public class BankingAccountController {
    Scanner scanner = new Scanner(System.in);
    AccountServiceImpl accountService = new AccountServiceImpl();

    public void displayMainBankingMenu() {
        int choice = -1;
        do {
            System.out.println("BANKING ACCOUNT MANAGEMENT SYSTEM\n" +
                    "1. Add an account\n" +
                    "2. Delete an account\n" +
                    "3. Display accounts list\n" +
                    "4. Searching accounts\n" +
                    "0. Exit\n" +
                    "(Please choose a number for accessing to these functions).");
            System.out.print("Enter your number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        accountService.add();
                        break;
                    case 2:
                        accountService.delete();
                        break;
                    case 3:
                        accountService.display();
                        break;
//                    case 4:
//                        System.out.println("BOOKING MANAGEMENT");
//                        System.out.println("1.\tAdd new booking\n" +
//                                "2.\tDisplay list booking\n" +
//                                "3.\tCreate new constracts\n" +
//                                "4.\tDisplay list contracts\n" +
//                                "5.\tEdit contracts\n" +
//                                "6.\tReturn main menu\n");
//                        break;
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
            } catch (NotFoundBankAccountException e) {
                System.out.println(e.getMessage());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } while (true);
    }
}

