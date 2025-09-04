public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 12, 4500);
        Course c2 = new Course("Web Development", 10, 4000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("CodIn Academy");
        c1.displayCourseDetails();
    }
}

