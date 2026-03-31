public class Course {
    private String code;
    private String title;
    private Tutor tutor;
    private int weeks;

    Course(String code, String title, int weeks, Tutor tutor) {
        this.code = code;
        this.title = title;
        this.weeks = weeks;
        this.tutor = tutor;
    }

    // Code
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    // Title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    // Weeks
    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public int getWeeks() {
        return this.weeks;
    }

    // Tutor
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Tutor getTutor() {
        return this.tutor;
    }

    public String toString() {
        return String.format(
                "Course Details: Course Code - %s | Course Title - %s | Course Duration - %d Weeks |%nTutor - %s",
                code, title, weeks, tutor);
    }
}
