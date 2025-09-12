package inheritance;
public class Manager extends Employee {
    String department;

    public Manager(String name, int id, double salary, String department) {
        super(name,id,salary); 
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call Employee's displayDetails
        System.out.println("Department: " + department);
    }
}


