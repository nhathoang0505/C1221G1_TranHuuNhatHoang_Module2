package collection_review.services;

import collection_review.models.Candidates;
import collection_review.models.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceServiceImpl implements IServices {
    static Scanner scanner = new Scanner(System.in);
    static List<Experience> experienceList = new ArrayList<>();

    static {
        experienceList.add(new Experience("1212dasd", "Hoang", "Tran", 5597, "hoang dieu", 123, "hoangtran@asdm", 0, 5, "dance"));
        experienceList.add(new Experience("asdzxc22", "Nghia", "Nguyen", 5597, "hoang dieu", 123, "hoangtran@asdm", 0, 5, "dance"));
        experienceList.add(new Experience("1212dasd", "An", "Phan", 5597, "hoang dieu", 123, "hoangtran@asdm", 0, 5, "dance"));
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
        int candidateType = Candidates.EXPERIENCE;
        System.out.println("Please input year of experience:");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Professional Skill:");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(candidateID, firstName, lastName, birthDay, address, phone, email, candidateType, expInYear, proSkill);
        experienceList.add(experience);
    }

    @Override
    public void display() {
        for (Experience element : experienceList) {
            System.out.println(element);
        }
    }

    public void displayName() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Experience element : experienceList) {
            System.out.println(element.getFirstName() + " " + element.getLastName());
        }
    }

    @Override
    public void search(String name) {
        for (Experience experience : experienceList) {
            if (experience.getFirstName().toLowerCase().contains(name.toLowerCase()) || experience.getLastName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(experience.getFirstName() + experience.getLastName() + "|" + experience.getBirthDay() + "|" + experience.getAddress() + "|" + experience.getPhone() + "|" + experience.getEmail() + "|" + experience.getCandidateType());
            }
        }
    }
}
