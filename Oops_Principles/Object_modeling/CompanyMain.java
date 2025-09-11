public class CompanyMain {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        comp.addDepartment("Engineering");
        comp.addDepartment("HR");

        comp.departments.get(0).addEmployee("John");
        comp.departments.get(0).addEmployee("Jane");
        comp.departments.get(1).addEmployee("Alice");

        comp.showStructure();

        comp.dissolve(); // All departments and employees are removed
    }
}
