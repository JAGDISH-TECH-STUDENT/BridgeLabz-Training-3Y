public class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("PG Student: " + name + ", Specialization: " + specialization);
    }
}

