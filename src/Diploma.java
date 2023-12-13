package src;

import java.util.ArrayList;

public class Diploma {

    private String studentName;
    private ArrayList<Course> courses = new ArrayList<>();

    public Diploma(String studentName)
    {
        this.studentName = studentName;
    }


    public void addCourse (Course course)
    {
        courses.add(course);
    }

    public double averageGrade()
    {
        double averageGrade = 0;
        for (Course course : courses)
        {
            averageGrade += course.getGrade();
        }

        averageGrade = averageGrade/courses.size();
        return averageGrade;
    }

    public String toString()
    {
        return "Student name: " + studentName + "" + courses;
    }
}
