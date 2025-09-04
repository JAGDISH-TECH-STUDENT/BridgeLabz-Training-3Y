public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Jagdish", 30);
        Person p2 = new Person(p1);
        p2.display();
    }
}

