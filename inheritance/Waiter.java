package inheritance;
class Waiter extends Person1 implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers at " + tableCount + " tables.");
    }

    public void displayRole() {
        System.out.println("Role: Waiter");
    }
}
