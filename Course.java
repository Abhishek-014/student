public class Course {
    String courseName;
    int credits;

    Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }
    public static void main(String[] args) {
        Student s1 = new Student("dom", 01);
        s1.displayStudentInfo();
        Course c1 = new Course("Sci", 01);
        c1.displayCourseInfo();
    }
}