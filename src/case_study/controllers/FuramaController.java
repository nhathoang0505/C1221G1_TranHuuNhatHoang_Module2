package case_study.controllers;

import case_study.services.ipml.CustomerServiceImpl;
import case_study.services.ipml.EmployeeServiceImpl;
import case_study.services.ipml.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void EmployeeManageMent() {
        int choice = -1;
        System.out.println("EMPLOYEE MANAGEMENT");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        System.out.println("Enter your number: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                employeeService.display();
                break;
            case 2:
                employeeService.add();
                break;
            case 3:
                employeeService.edit();
                break;
            case 4:
                break;
        }
    }

    public void customerManagement() {
        int choice = -1;
        System.out.println("CUSTOMER MANAGEMENT");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                customerService.display();
                break;
            case 2:
                customerService.add();
                break;
            case 3:
                customerService.edit();
                break;
            case 4:
                break;
        }
    }

    public void facilityManagement() {
        int choice = -1;
        System.out.println("FACILITY MANAGEMENT");
        System.out.println("1.\tDisplay list facility\n" +
                "2.\tAdd new facility\n" +
                "3.\tDisplay list facility maintenance\n" +
                "4.\tReturn main menu\n");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                facilityService.display();
                break;
            case 2:
                addNewFacilityMenu();
                break;
            case 3:
                facilityService.displayMaintaince();
                break;
            case 4:
                break;
        }
    }


    public void addNewFacilityMenu() {
        int choice = -1;
        System.out.println("ADD NEW FACILITY MENU");
        System.out.println("1.\tAdd new Villa\n" +
                "2.\tAdd new House\n" +
                "3.\tAdd new Room\n" +
                "4.\tReturn main menu\n");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                facilityService.addNewVilla();
                addNewFacilityMenu();
                break;
            case 2:
                facilityService.addNewHouse();
                addNewFacilityMenu();
                break;
            case 3:
                facilityService.addNewRoom();
                addNewFacilityMenu();
                break;
            case 4:
                break;
        }
    }

    public void displayMainMenu() {
        int choice = -1;
        do {
            System.out.println("FURAMA MANAGEMENT SYSTEM\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "(Please choose a number for accessing to these functions).");
            System.out.println("Enter your number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeManageMent();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    System.out.println("BOOKING MANAGEMENT");
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("PROMOTION MANAGEMENT");
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }
}

