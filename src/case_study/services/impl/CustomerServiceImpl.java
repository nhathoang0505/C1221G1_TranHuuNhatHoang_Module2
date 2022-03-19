package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.ICustomerService;
import case_study.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    public static final String CUSTOMER_PATH = "src\\case_study\\data\\customer.csv";
    static List<Customer> customerList = new LinkedList<>();

    static {
        customerList = ReadAndWriteFile.readCustomerListFromCSV(CUSTOMER_PATH);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
//        String personName, String sex, int personIDNumber, int phoneNumber, String personEmail, String customerId, String customerRank, String address
        System.out.print("Input Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Input Customer gender: ");
        String customerSex = scanner.nextLine();
        System.out.print("Input Customer ID Number: ");
        int customerIDNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Customer phone number: ");
        int customerPhoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Customer email: ");
        String customerEmail = scanner.nextLine();
        System.out.print("Input Customer Identify Code: ");
        String customerID = scanner.nextLine();
        System.out.print("Input Customer RANK level: ");
        String customerRank = scanner.nextLine();
        System.out.print("Input Customer address: ");
        String customerAddress = scanner.nextLine();
        Customer customer = new Customer(customerName, customerSex, customerIDNumber, customerPhoneNumber, customerEmail, customerID, customerRank, customerAddress);
        customerList.add(customer);
        ReadAndWriteFile.writeListCustomerToCSV(CUSTOMER_PATH,customerList);
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        System.out.print("Please input the ID of Customer that want to edit: ");
        int idCustomerNeedToFind = Integer.parseInt(scanner.nextLine());
        for (Customer customerEdit : customerList) {
            if (idCustomerNeedToFind == (customerEdit.getPersonIDNumber())) {
                System.out.print("Input information you want to edit\n" +
                        "1. Edit employee name:\n" +
                        "2. Edit employee gender:\n" +
                        "3. Edit employee ID Number:\n" +
                        "4. Edit employee phone Number:\n" +
                        "5. Edit employee email:\n" +
                        "6. Edit employee Identify Code:\n" +
                        "7. Edit employee Rank level:\n" +
                        "8. Edit employee Address:\n" +
                        "9. Exit\n" +
                        "(Please choose a number for accessing to these functions).");
                System.out.print("Enter your number: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Input new NAME for Customer: ");
                        customerEdit.setPersonName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Input new GENDER for Customer: ");
                        customerEdit.setGender(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Input new ID NUMBER for Customer: ");
                        customerEdit.setPersonIDNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.print("Input new PHONE number for Customer: ");
                        customerEdit.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.print("Input new EMAIL for Customer: ");
                        customerEdit.setPersonEmail(scanner.nextLine());
                        break;
                    case 6:
                        System.out.print("Input new IDENTIFY CODE for Customer: ");
                        customerEdit.setCustomerID(scanner.nextLine());
                        break;
                    case 7:
                        System.out.print("Input new RANK LEVEL for Customer: ");
                        customerEdit.setCustomerRank(scanner.nextLine());
                        break;
                    case 8:
                        System.out.print("Input new ADDRESS for Customer: ");
                        customerEdit.setAddress(scanner.nextLine());
                        break;
                    case 9:
                        System.exit(10);
                        break;
                    default:
                        System.out.print("NO CHOICE!");
                }
                break;
            }
        }
    }
}
