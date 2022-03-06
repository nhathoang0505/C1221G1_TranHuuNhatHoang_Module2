package collection_review.services;

import collection_review.models.Candidates;
import collection_review.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternServiceImpl implements IServices {
    static Scanner scanner = new Scanner(System.in);
    static List<Intern> internList = new ArrayList<>();

    static {
        internList.add(new Intern("1212dasd", "Hoang", "Tran", 5597, "hoang dieu", 123, "hoangtran@asdm", 1, "electricity", 4, "Kinh te"));
        internList.add(new Intern("1212dasd", "Nghia", "Nguyen", 5597, "hoang dieu", 123, "hoangtran@asdm", 1, "electricity", 4, "Kinh te"));
        internList.add(new Intern("1212dasd", "An", "Phan", 5597, "hoang dieu", 123, "hoangtran@asdm", 1, "electricity", 4, "Kinh te"));
    }

    @Override
    public void add() {
        System.out.println("Please input candidate ID:");
        String candidateID = scanner.nextLine();
        System.out.println("Please input first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please input last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please input birthday:");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input address:");
        String address = scanner.nextLine();
        System.out.println("Please input Phone:");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input email:");
        String email = scanner.nextLine();
        int candidateType = Candidates.INTERN;
        System.out.println("Please input major:");
        String majors = scanner.nextLine();
        System.out.println("Please input semester:");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Name of university:");
        String universityName = scanner.nextLine();
        Intern intern = new Intern(candidateID, firstName, lastName, birthDay, address, phone, email, candidateType, majors, semester, universityName);
        internList.add(intern);
    }

    @Override
    public void display() {
        for (Intern element : internList) {
            System.out.println(element);
        }
    }

    public void displayName() {
        System.out.println("===========INTERN CANDIDATE==============");
        for (Intern element : internList) {
            System.out.println(element.getFirstName() + " " + element.getLastName());
        }
    }

    @Override
    public void search(String name) {
        for (Intern intern : internList) {
            if (intern.getFirstName().toLowerCase().contains(name.toLowerCase()) || intern.getLastName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(intern.getFirstName()  + intern.getLastName() + "|" + intern.getBirthDay() + "|" + intern.getAddress() + "|" + intern.getPhone() + "|" + intern.getEmail() + "|" + intern.getCandidateType());
            }
        }
    }
}
