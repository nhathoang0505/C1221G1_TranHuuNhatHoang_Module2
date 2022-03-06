package collection_review.controllers;

import collection_review.models.Candidates;
import collection_review.models.Experience;
import collection_review.services.ExperienceServiceImpl;
import collection_review.services.FresherServiceImpl;
import collection_review.services.IServices;
import collection_review.services.InternServiceImpl;

import java.util.Scanner;

public class CandidatesController {
    static Scanner scanner = new Scanner(System.in);
    IServices experienceService = new ExperienceServiceImpl();
    IServices fresherService = new FresherServiceImpl();
    IServices internService = new InternServiceImpl();

    public void createNewCandidate(IServices services) {
        char userInput;
        do {
            services.add();
            System.out.println("Do you want to continue (Y/N)?");
            userInput = scanner.nextLine().toLowerCase().charAt(0);
            if(userInput=='n'){
                break;
            }
        } while (true);
        services.display();
    }
    public void searchingByCandidateTypes(){
        experienceService.displayName();
        fresherService.displayName();
        internService.displayName();
        System.out.println("Input NAME for searching");
        String findName = scanner.nextLine();
        System.out.println("Input TYPE of candidate: ");
        int findByTypeOfCandidate=Integer.parseInt(scanner.nextLine());
        switch (findByTypeOfCandidate){
            case 0:
                experienceService.search(findName);
                break;
            case 1:
                fresherService.search(findName);
                break;
            case 2:
                internService.search(findName);
                break;
            default:
                System.out.println("Wrong typed");
        }
    }

    public void display() {
        int choice = -1;
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n" +
                    "4. Searching\n" +
                    "5. Exit\n" +
                    "(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate,\n" +
                    "4 to Searching and 5 to Exit program).");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createNewCandidate(experienceService);
                    break;
                case 2:
                    createNewCandidate(fresherService);
                    break;
                case 3:
                    createNewCandidate(internService);
                    break;
                case 4:
                    searchingByCandidateTypes();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
