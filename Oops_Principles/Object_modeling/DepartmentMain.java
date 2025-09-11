
public class DepartmentMain {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Mehta");
        Faculty f2 = new Faculty("Dr. Roy");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.deleteUniversity(); // Composition
        System.out.println("Faculty still exists: " + f1.name + ", " + f2.name); // Aggregation
    }
}
