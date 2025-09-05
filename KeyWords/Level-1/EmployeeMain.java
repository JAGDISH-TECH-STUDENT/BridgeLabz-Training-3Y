
public class EmployeeMain {
    public static void main(String[] args) {
        // 🏢 Set company name
        Employee.setCompanyName("Tech Solutions Inc.");

        // 👥 Create employee instances
        Employee emp1 = new Employee("Thamarai", 101, "Software Engineer");
        Employee emp2 = new Employee("Rohan", 102, "Project Manager");

        // 📊 Display total employees
        Employee.displayTotalEmployees();

        // 📋 Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}

