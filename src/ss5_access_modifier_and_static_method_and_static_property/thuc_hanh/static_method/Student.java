package ss5_access_modifier_and_static_method_and_static_property.thuc_hanh.static_method;

public class Student {
    private static String college = "BBDIT";
    private int rollno;
    private String name;

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
