package collection_review.services;

import collection_review.models.Candidates;
import collection_review.models.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherServiceImpl implements IServices {
    static Scanner scanner = new Scanner(System.in);
    static List<Fresher> fresherList = new ArrayList<>();

    static {
        fresherList.add(new Fresher("1212dasd", "Hoang", "Tran", 5597, "hoang dieu", 123, "hoangtran@asdm", 1, 2020, "good", "Da Nang"));
        fresherList.add(new Fresher("1212dasd", "Nghia", "Nguyen", 5597, "hoang dieu", 123, "hoangtran@asdm", 1, 2020, "good", "Da Nang"));
        fresherList.add(new Fresher("1212dasd", "An", "Phan", 5597, "hoang dieu", 123, "hoangtran@asdm", 1, 2020, "good", "Da Nang"));
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
        int candidateType = Candidates.FRESHER;
        System.out.println("Please input graduation date:");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input graduation rank:");
        String graduationRank = scanner.nextLine();
        System.out.println("Please input university where student graduated:");
        String education = scanner.nextLine();
        Fresher fresher = new Fresher(candidateID, firstName, lastName, birthDay, address, phone, email, candidateType, graduationDate, graduationRank, education);
        fresherList.add(fresher);
    }

    @Override
    public void display() {
        for (Fresher element : fresherList) {
            System.out.println(element);
        }
    }

    public void displayName() {
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Fresher element : fresherList) {
            System.out.println(element.getFirstName() + " " + element.getLastName());
        }
    }

    @Override
    public void search(String name) {
        for (Fresher fresher : fresherList) {
            if (fresher.getFirstName().toLowerCase().contains(name.toLowerCase()) || fresher.getLastName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(fresher.getFirstName()  + fresher.getLastName() + "|" + fresher.getBirthDay() + "|" + fresher.getAddress() + "|" + fresher.getPhone() + "|" + fresher.getEmail() + "|" + fresher.getCandidateType());
            }
        }
    }
}
