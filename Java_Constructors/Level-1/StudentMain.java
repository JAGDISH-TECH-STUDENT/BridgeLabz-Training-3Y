public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit", 8.5);
        s1.display();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(102, "Neha", 9.2, "AI & ML");
        pg.displayPGDetails();
    }
}


