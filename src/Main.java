package src;

public class Main {

    public static void main(String[] args) {
        Diploma diploma = new Diploma("Elly");

        Course danish = new Course("Dansih", 7);
        Course  english = new Course("English", 4);
        Course math = new Course("Math", 10);
        Course pe = new Course("PE", 9);
        Course biology = new Course("Biology", -3);

        diploma.addCourse(danish);
        diploma.addCourse(english);
        diploma.addCourse(math);
        diploma.addCourse(pe);
        diploma.addCourse(biology);

        System.out.println(diploma.toString());
        System.out.println(diploma.averageGrade());

    }
}
