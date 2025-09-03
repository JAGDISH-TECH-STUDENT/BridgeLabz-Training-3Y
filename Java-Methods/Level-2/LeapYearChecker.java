public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }
}
