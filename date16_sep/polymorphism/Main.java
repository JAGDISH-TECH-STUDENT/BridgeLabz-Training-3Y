package date16_sep.polymorphism;

public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal();
    // Tiger animalRef = new Animal();

    animal.eat();


    Tiger tiger = new Tiger();

    String tigerWalks = tiger.walk(2,2);
    System.out.println(tigerWalks);

    Animal tigerRef = new Tiger();
    String tigerRefWalks = tigerRef.walk(2,2);
    System.out.println(tigerRefWalks);


    }
}
