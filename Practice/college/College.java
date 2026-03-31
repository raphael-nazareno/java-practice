public class College {

    public static void main(String[] args) {

        Tutor tutor1 = new Tutor("s4126823", "Raphael");

        Course course1 = new Course("COSC2395", "Programming A", 17, tutor1);
        Course course2 = new Course("COSC2446", "Web Programming", 17, tutor1);

        System.out.println(course1);
        System.out.println(course2);
    }

}