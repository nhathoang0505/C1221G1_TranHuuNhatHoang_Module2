package case_study.services.ipml;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.ICustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("Nhat Hoang", "male", 5597, 511, "nhathoang0505@gmail.com", "hoang55", "Diamond", "Viet Nam"));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
//        String personName, String sex, int personIDNumber, int phoneNumber, String personEmail, String customerId, String customerRank, String address
        System.out.println("Input Customer Name:");
        String customerName = scanner.nextLine();
        System.out.println("Input Customer gender:");
        String customerSex = scanner.nextLine();
        System.out.println("Input Customer ID Number:");
        int customerIDNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Customer phone number:");
        int customerPhoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Customer email:");
        String customerEmail = scanner.nextLine();
        System.out.println("Input Customer Identify Code:");
        String customerID = scanner.nextLine();
        System.out.println("Input Customer RANK level:");
        String customerRank = scanner.nextLine();
        System.out.println("Input Customer address: ");
        String customerAddress = scanner.nextLine();
        Customer customer = new Customer(customerName,customerSex,customerIDNumber,customerPhoneNumber,customerEmail,customerID,customerRank,customerAddress);
        customerList.add(customer);
    }

    @Override
    public void display() {
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        System.out.println("Please input the ID of Customer that want to edit:");
        int idCustomerNeedToFind = Integer.parseInt(scanner.nextLine());
        for (Customer customerEdit : customerList) {
            if (idCustomerNeedToFind==(customerEdit.getPersonIDNumber())) {
                System.out.println("Input information you want to edit\n" +
                        "1. Edit employee name:\n" +
                        "2. Edit employee sex:\n" +
                        "3. Edit employee ID Number:\n" +
                        "4. Edit employee phone Number:\n" +
                        "5. Edit employee email:\n" +
                        "6. Edit employee Identify Code:\n" +
                        "7. Edit employee Rank level:\n" +
                        "8. Edit employee Address:\n" +
                        "9. Exit\n" +
                        "(Please choose a number for accessing to these functions).");
                System.out.println("Enter your number: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Input new NAME for Customer:");
                        customerEdit.setPersonName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Input new GENDER for Customer:");
                        customerEdit.setSex(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Input new ID NUMBER for Customer:");
                        customerEdit.setPersonIDNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("Input new PHONE number for Customer:");
                        customerEdit.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("Input new EMAIL for Customer:");
                        customerEdit.setPersonEmail(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Input new IDENTIFY CODE for Customer:");
                        customerEdit.setCustomerID(scanner.nextLine());
                        break;
                    case 7:
                        System.out.println("Input new RANK LEVEL for Customer: ");
                        customerEdit.setCustomerRank(scanner.nextLine());
                        break;
                    case 8:
                        System.out.println("Input new ADDRESS for Customer:");
                        customerEdit.setAddress(scanner.nextLine());
                        break;
                    case 9:
                        System.exit(10);
                        break;
                    default:
                        System.out.println("NO CHOICE!");
                }
                break;
            }
        }
    }
}
