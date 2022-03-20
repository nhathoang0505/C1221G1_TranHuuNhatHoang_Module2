package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.IEmployeeService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    public static final String EMPLOYEE_PATH = "src\\case_study\\data\\employee.csv";
    static List<Employee> employeeList = new ArrayList<>();

    static {

        employeeList = ReadAndWriteFile.readEmployeeListFromCSV(EMPLOYEE_PATH);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        display();
        boolean isFound = false;
        System.out.print("Please input the ID of employee that want to edit: ");
        int idEmployeeNeedToFind = Integer.parseInt(scanner.nextLine());
        for (Employee employeeEdit : employeeList) {
            if (idEmployeeNeedToFind == (employeeEdit.getPersonIDNumber())) {
                editProperties(employeeEdit);
                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Cannot find your input ID ");
        }
        ReadAndWriteFile.writeListEmployeeToCSV(EMPLOYEE_PATH, employeeList);
    }

    private void editProperties(Employee employeeEdit) {
        System.out.println("Employee Editing Menu");
        System.out.print("Input information you want to edit\n" +
                "1. Edit employee name:\n" +
                "2. Edit employee gender:\n" +
                "3. Edit employee ID Number:\n" +
                "4. Edit employee phone Number:\n" +
                "5. Edit employee email:\n" +
                "6. Edit employee Identify Code:\n" +
                "7. Edit employee academic level:\n" +
                "8. Edit employee position:\n" +
                "9. Edit employee salary:\n" +
                "10. Exit\n" +
                "(Please choose a number for accessing to these functions).\n");
        String confirmContinue;
        do {
            try {
                System.out.println("EMPLOYEE Editing Menu");
                System.out.print("Enter your number: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Input new NAME for Employee: ");
                        employeeEdit.setPersonName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Input new GENDER for Employee: ");
                        employeeEdit.setGender(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Input new ID NUMBER for Employee: ");
                        employeeEdit.setPersonIDNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.print("Input new PHONE number for Employee: ");
                        employeeEdit.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.print("Input new EMAIL for Employee: ");
                        employeeEdit.setPersonEmail(scanner.nextLine());
                        break;
                    case 6:
                        System.out.print("Input new IDENTIFY CODE for Employee: ");
                        employeeEdit.setEmployeeID(scanner.nextLine());
                        break;
                    case 7:
                        System.out.print("Input new ACADEMIC LEVEL for Employee: ");
                        employeeEdit.setAcademicLevel(scanner.nextLine());
                        break;
                    case 8:
                        System.out.print("Input new POSITION for Employee: ");
                        employeeEdit.setPosition(scanner.nextLine());
                        break;
                    case 9:
                        System.out.print("Input new SALARY for Employee: ");
                        employeeEdit.setSalary(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 0:
                        System.exit(10);
                        break;
                    default:
                        System.out.print("NO CHOICE!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Only NUMBER accepted");
            }
            System.out.println("Do you want to continue? (Y/N): ");
            confirmContinue = scanner.nextLine();
            if (confirmContinue.toUpperCase().equals("N")) {
                break;
            }
        } while (true);
    }

    @Override
    public void add() {
        System.out.print("Input employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Input employee GENDER: ");
        String employeSex = scanner.nextLine();
        int employeeIDNumber;
        do {
            try {
                System.out.print("Input employee ID Number: ");
                employeeIDNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Only NUMBER accepted");
            }
        } while (true);
        int employeePhoneNumber;
        do {
            try {
                System.out.print("Input employee phone number: ");
                employeePhoneNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Only NUMBER accepted");
            }
        } while (true);
        System.out.print("Input employee email: ");
        String employeeEmail = scanner.nextLine();
        System.out.print("Input employee Identify Card: ");
        String employeeID = scanner.nextLine();
        System.out.print("Input employee academic level: ");
        String academicLevel = scanner.nextLine();
        System.out.print("Input employee position: ");
        String position = scanner.nextLine();
        double salary;
        do {
            try {
                System.out.print("Input employee salary: ");
                salary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Only NUMBER accepted");
            }
        } while (true);
        Employee employee = new Employee(employeeName, employeSex, employeeIDNumber, employeePhoneNumber, employeeEmail, employeeID, academicLevel, position, salary);
        employeeList.add(employee);
        ReadAndWriteFile.writeListEmployeeToCSV(EMPLOYEE_PATH, employeeList);
        //String personName, String sex, int personIDNumber, int phoneNumber, String personEmail, String employeeID, String academicLevel, String position, double salary
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
