package date16_sep.polymorphism;

public class Animal {
    int noOfLegs;
    int noOfEyes;
    int noOfTeeth;
    String colour;
    double weight;
    String gender;
    int height;

    // public void walk() {
    // System.out.println("Animal walks");
    // }

    public String walk(int noOfLegs, int noOfEyes) {
    return "Animal walks ";
    }

    public void eat() {
    System.out.println("Animal Eats");
    }


    public Animal() {
    }

    public Animal(int noOfLegs, int noOfEyes, int noOfTeeth) {
    this.noOfLegs = noOfLegs;
    this.noOfEyes = noOfEyes;
    this.noOfTeeth = noOfTeeth;
    }

    // public Animal(com.gla.oops.Animal animal) {
    // this.noOfLegs = animal.noOfLegs;
    // this.noOfEyes = animal.noOfEyes;
    // this.noOfTeeth = animal.noOfTeeth;
    // }

    public Animal(int noOfLegs, int noOfEyes, int noOfTeeth, String colour, double weight, String gender, int height) {
    this.noOfLegs = noOfLegs;
    this.noOfEyes = noOfEyes;
    this.noOfTeeth = noOfTeeth;
    this.colour = colour;
    this.weight = weight;
    this.gender = gender;
    this.height = height;
    }
}
