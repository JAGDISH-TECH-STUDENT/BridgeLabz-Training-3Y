
public class Employee {
    // 🏢 Static variables shared across all employees
    private static String companyName;
    private static int totalEmployees = 0;

    // 👤 Instance variables
    private String name;
    private final int id; // 🔐 Final: Immutable employee ID
    private String designation;

    // 🛠 Constructor using 'this' to initialize fields
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // 🏢 Static method to set company name
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // 📊 Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // 📋 Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }

    // 🧭 Getters for encapsulation
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }
}

