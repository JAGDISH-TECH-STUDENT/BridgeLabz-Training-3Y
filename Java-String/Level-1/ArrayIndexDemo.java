public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); 
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        String[] names = {"Jagdish", "Amit", "Neha"};
        // generateException(names);
        handleException(names);
    }
}
