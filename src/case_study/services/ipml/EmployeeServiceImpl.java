package case_study.services.ipml;

import case_study.models.Employee;
import case_study.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Phan An", "male", 1608, 0511, "phanan@gmail.com", "An168", "Graduated", "Receptionist", 5000));
        employeeList.add(new Employee("Thanh Nghia", "male", 2601, 0522, "nghia@gmail.com", "Nghia261", "Graduated", "Receptionist", 5000));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Please input the ID of employee that want to edit:");
        int idEmployeeNeedToFind = Integer.parseInt(scanner.nextLine());
        for (Employee employeeEdit : employeeList) {
            if (idEmployeeNeedToFind==(employeeEdit.getPersonIDNumber())) {
                System.out.println("Input information you want to edit\n" +
                        "1. Edit employee name:\n" +
                        "2. Edit employee sex:\n" +
                        "3. Edit employee ID Number:\n" +
                        "4. Edit employee phone Number:\n" +
                        "5. Edit employee email:\n" +
                        "6. Edit employee Identify Code:\n" +
                        "7. Edit employee academic level:\n" +
                        "8. Edit employee position:\n" +
                        "9. Edit employee salary:\n" +
                        "10. Exit\n" +
                        "(Please choose a number for accessing to these functions).");
                System.out.println("Enter your number: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Input new NAME for Employee:");
                        employeeEdit.setPersonName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Input new GENDER for Employee:");
                        employeeEdit.setSex(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Input new ID NUMBER for Employee:");
                        employeeEdit.setPersonIDNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("Input new PHONE number for Employee:");
                        employeeEdit.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("Input new EMAIL for Employee:");
                        employeeEdit.setPersonEmail(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Input new IDENTIFY CODE for Employee:");
                        employeeEdit.setEmployeeID(scanner.nextLine());
                        break;
                    case 7:
                        System.out.println("Input new ACADEMIC LEVEL for Employee: ");
                        employeeEdit.setAcademicLevel(scanner.nextLine());
                        break;
                    case 8:
                        System.out.println("Input new POSITION for Employee:");
                        employeeEdit.setPosition(scanner.nextLine());
                        break;
                    case 9:
                        System.out.println("Input new SALARY for Employee: ");
                        employeeEdit.setSalary(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 10:
                        System.exit(10);
                        break;
                    default:
                        System.out.println("NO CHOICE!");
                }
                break;
            }
        }
    }

    @Override
    public void add() {
        System.out.println("Input employee Name:");
        String employeeName = scanner.nextLine();
        System.out.println("Input employee gender:");
        String employeSex = scanner.nextLine();
        System.out.println("Input employee ID Number:");
        int employeeIDNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input employee phone number:");
        int employeePhoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input employee email:");
        String employeeEmail = scanner.nextLine();
        System.out.println("Input employee Identify Card:");
        String employeeID = scanner.nextLine();
        System.out.println("Input employee academic level:");
        String academicLevel = scanner.nextLine();
        System.out.println("Input employee position:");
        String position = scanner.nextLine();
        System.out.println("Input employee salary:");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeName, employeSex, employeeIDNumber, employeePhoneNumber, employeeEmail, employeeID, academicLevel, position, salary);
        employeeList.add(employee);
        //String personName, String sex, int personIDNumber, int phoneNumber, String personEmail, String employeeID, String academicLevel, String position, double salary
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
