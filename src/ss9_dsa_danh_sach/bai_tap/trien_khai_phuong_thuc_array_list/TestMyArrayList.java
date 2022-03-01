package ss9_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_array_list;

public class TestMyArrayList {
    public static void main(String[] args) {
        Student a = new Student(1, "Hoàng");
        Student b = new Student(2, "Long");
        Student c = new Student(3, "Dung");
        Student d = new Student(4, "An");
        Student e = new Student(5, "Nghĩa");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println("Index=" + studentMyArrayList.indexOf(c));
        System.out.println(studentMyArrayList.contains(b));
        System.out.println(studentMyArrayList.contains(a));

        MyArrayList<Student> newArrayList = new MyArrayList<>();
        newArrayList = studentMyArrayList.clone();
        newArrayList.remove(0);
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.println(newArrayList.get(i).getName());
        }
    }

    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
