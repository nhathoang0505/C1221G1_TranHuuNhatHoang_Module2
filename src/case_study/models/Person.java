package case_study.models;

public abstract class Person {
    private String personName;
    private String gender;
    private int personIDNumber;
    private int phoneNumber;
    private String personEmail;

    public Person(String personName, String gender, int personIDNumber, int phoneNumber, String personEmail) {
        this.personName = personName;
        this.gender = gender;
        this.personIDNumber = personIDNumber;
        this.phoneNumber = phoneNumber;
        this.personEmail = personEmail;
    }


    public String getInfoToCSV() {
        return this.personName + "," + this.gender + "," + this.personIDNumber + "," + this.phoneNumber + "," + this.personEmail;
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPersonIDNumber() {
        return personIDNumber;
    }

    public void setPersonIDNumber(int personIDNumber) {
        this.personIDNumber = personIDNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    @Override
    public String toString() {
        return
                "personName='" + personName + '\'' +
                        ", gender='" + gender + '\'' +
                        ", personIDNumber=" + personIDNumber +
                        ", phoneNumber=" + phoneNumber +
                        ", personEmail='" + personEmail + '\'' + ",";
    }
}
