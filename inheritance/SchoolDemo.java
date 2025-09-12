package inheritance;
public class SchoolDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Sharma", 40, "Mathematics");
        Student student = new Student("Rahul", 16, "10th Grade");
        Staff staff = new Staff("Mr. Verma", 35, "Administration");

        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        student.displayRole();
        student.displayDetails();
        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}
