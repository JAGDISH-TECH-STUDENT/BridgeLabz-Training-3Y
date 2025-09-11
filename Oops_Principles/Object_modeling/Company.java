import java.util.*;

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void dissolve() {
        departments.clear(); // Composition: removing company removes departments
        System.out.println(name + " has been dissolved.");
    }

    void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            System.out.println("- Department: " + d.name);
            d.showEmployees();
        }
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showEmployees() {
        for (Employee e : employees) {
            System.out.println("  - Employee: " + e.name);
        }
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}