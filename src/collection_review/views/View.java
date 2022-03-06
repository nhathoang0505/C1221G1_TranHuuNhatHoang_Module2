package collection_review.views;

import collection_review.controllers.CandidatesController;

public class View {
    public static void main(String[] args) {
        CandidatesController candidatesController = new CandidatesController();
        candidatesController.display();
    }
}
