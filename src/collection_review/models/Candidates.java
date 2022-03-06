package collection_review.models;

public abstract class Candidates {
    private String candidateID;
    private String firstName;
    private String lastName;
    private int birthDay;
    private String address;
    private int Phone;
    private String email;
    private int candidateType;
    public static final int EXPERIENCE = 0;
    public static final int FRESHER = 1;
    public static final int INTERN = 3;

    public Candidates() {
    }

    public Candidates(String candidateID, String firstName, String lastName, int birthDay, String address, int phone, String email, int candidateType) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        Phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return
                "candidateID='" + candidateID + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", birthDay=" + birthDay +
                        ", address='" + address + '\'' +
                        ", Phone=" + Phone +
                        ", email='" + email + '\'' +
                        ", candidateType=" + candidateType;
    }
}
