public class Main1 {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Sara");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.viewCourses();
        s2.viewCourses();
        c1.showEnrolledStudents();
    }
}
