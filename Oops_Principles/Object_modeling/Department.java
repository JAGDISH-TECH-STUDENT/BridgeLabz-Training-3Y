import java.util.*;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted. All departments removed.");
    }
}
