public class AnimalMain {
    public static void main(String[] args) {
        // Create objects of each subclass
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Demonstrate polymorphism
        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            animal.makeSound(); // Dynamic method dispatch
        }
    }
}
