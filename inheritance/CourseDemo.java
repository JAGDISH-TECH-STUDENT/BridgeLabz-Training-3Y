package inheritance;

public class CourseDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 12, "Udemy", true, 4999.0, 20.0);
        poc.displayDetails();
    }
}
