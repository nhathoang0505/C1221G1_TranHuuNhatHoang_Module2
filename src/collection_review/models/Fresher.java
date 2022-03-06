package collection_review.models;

public class Fresher extends Candidates {
    private int graduationDate;
    private String graduationRank;
    private String Education;

    public Fresher(int graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        Education = education;
    }

    public Fresher(String candidateID, String firstName, String lastName, int birthDay, String address, int phone, String email, int candidateType, int graduationDate, String graduationRank, String education) {
        super(candidateID, firstName, lastName, birthDay, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        Education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString() +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", Education='" + Education + '\'' +
                '}';
    }
}
