package case_study.models;

public class Employee extends Person {
    private String employeeID;
    private String academicLevel;
    private String position;
    private double salary;

    public Employee(String personName, String sex, int personIDNumber, int phoneNumber, String personEmail) {
        super(personName, sex, personIDNumber, phoneNumber, personEmail);
    }

    public Employee(String personName, String sex, int personIDNumber, int phoneNumber, String personEmail, String employeeID, String academicLevel, String position, double salary) {
        super(personName, sex, personIDNumber, phoneNumber, personEmail);
        this.employeeID = employeeID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "employeeID='" + employeeID + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
