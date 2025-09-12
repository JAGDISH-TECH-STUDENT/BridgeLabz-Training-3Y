package inheritance;
public class EmployeeTest {
    public static void main(String[] args) {
        Manager mgr = new Manager("Amit Sharma", 101, 120000.0, "HR");
        Developer dev = new Developer("Sneha Rao", 102, 90000.0, "Java");
        Intern intern = new Intern("Rahul Verma", 103, 15000.0, 6);

        System.out.println("Manager Details:");
        mgr.displayDetails();

        System.out.println("\nDeveloper Details:");
        dev.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}

