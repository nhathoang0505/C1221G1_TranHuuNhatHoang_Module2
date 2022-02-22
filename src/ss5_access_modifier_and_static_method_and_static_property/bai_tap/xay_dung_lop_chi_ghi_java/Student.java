package ss5_access_modifier_and_static_method_and_static_property.bai_tap.xay_dung_lop_chi_ghi_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    private Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

class HocSinh {
    public static void main(String[] args) {
        Student student1 = new Student();
//        student1.setName("Hoang");
//        student1.setClasses("C12");

        System.out.println(student1.toString());

    }

}
