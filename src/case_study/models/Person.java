package case_study.models;

public abstract class Person {
    private String personName;
    private String sex;
    private int personIDNumber;
    private int phoneNumber;
    private String personEmail;

    public Person(String personName, String sex, int personIDNumber, int phoneNumber, String personEmail) {
        this.personName = personName;
        this.sex = sex;
        this.personIDNumber = personIDNumber;
        this.phoneNumber = phoneNumber;
        this.personEmail = personEmail;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
                ", sex='" + sex + '\'' +
                ", personIDNumber=" + personIDNumber +
                ", phoneNumber=" + phoneNumber +
                ", personEmail='" + personEmail + '\'' + ",";
    }
}
