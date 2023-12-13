package src;

public class Course {

    private String courseName;
    private int grade;

    public Course (String courseName, int grade)
    {
        switch (grade) {
            case -3:
                this.grade = grade;
                break;
            case 00:
                this.grade = grade;
                break;
            case 02:
                this.grade = grade;
                break;
            case 4:
                this.grade = grade;
                break;
            case 7:
                this.grade = grade;
                break;
            case 10:
                this.grade = grade;
                break;
            case 12:
                this.grade = grade;
                break;
            default:
                System.out.println("Please write -3, 00, 02, 4, 7, 10 or 12 for " + courseName);
                break;
        }
        this.courseName = courseName;
    }

    public int getGrade ()
    {
        return grade;
    }


    public String toString()
        {
            return "Coursename: " + courseName + ", Grade: " + grade;

    }
}
