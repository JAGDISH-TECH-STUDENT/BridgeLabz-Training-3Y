package inheritance;
class Chef extends Person1 implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing dishes, specializing in: " + specialty);
    }

    public void displayRole() {
        System.out.println("Role: Chef");
    }
}
