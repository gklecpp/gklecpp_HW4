package Aggregation;

public class Course {
    private String courseName;

    private Instructor instructor1;
    private Instructor instructor2;

    private Textbook textbook1;
    private Textbook textbook2;

    public Course(String courseName, Instructor instructor1, Instructor instructor2, Textbook textbook1, Textbook textbook2){
        this.courseName = courseName;
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook1 = textbook1;
        this.textbook2 = textbook2;
    }

    public void setCourseNumber(String courseName){
        this.courseName = courseName;
    }

    public void print(){
        System.out.println("Course Name: " + courseName);

        System.out.println("Instructor 1: " + instructor1.getFirstName() + " " + instructor1.getLastName());

        System.out.println("Instructor 2: " + instructor2.getFirstName() + " " + instructor2.getLastName());

        System.out.println("Textbook 1: " + textbook1.getTitle() + " by " + textbook1.getAuthor());

        System.out.println("Textbook 2: " + textbook2.getTitle() + " by " + textbook2.getAuthor());
    }

}
