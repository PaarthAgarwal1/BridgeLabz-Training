class Course {
    // declaring instance variables
    String courseName;
    String duration;
    double fee;

    // declaring static variable common to all courses
    static String instituteName = "Tech Academy";

    // initializing course details
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // displaying course details including institute name
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: $" + fee);
        System.out.println("---------------------------");
    }

    // updating the institute name for all courses
    public static void updateInstituteName(String newName) {
        // modifying the static variable
        instituteName = newName;
    }

    public static void main(String[] args) {
        // creating two course objects
        Course c1 = new Course("Java Programming", "3 Months", 300.0);
        Course c2 = new Course("Web Development", "4 Months", 400.0);

        // displaying initial details
        System.out.println("--- Before Update ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // updating the static institute name
        Course.updateInstituteName("Global Tech Institute");

        // showing that the change reflects in all objects
        System.out.println("--- After Update ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}