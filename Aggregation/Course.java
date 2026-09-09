package Aggregation;

// Course aggregates Instructor and Textbook objects
public class Course {
    // stores the name of the course
    private String courseName;

    // references the 2 existing Instructor objects
    private Instructor instructor1;
    private Instructor instructor2;

    // references the 2 existing Textbook objects
    private Textbook textbook1;
    private Textbook textbook2;

    // constructor used to create a Course
    public Course(String courseName, Instructor instructor1, Instructor instructor2, Textbook textbook1, Textbook textbook2){
        this.courseName = courseName;
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook1 = textbook1;
        this.textbook2 = textbook2;
    }

    // changes the name of the course
    public void setCourseNumber(String courseName){
        this.courseName = courseName;
    }

    // prints the course information including information from the Instructor and Textbook object
    public void print(){
        System.out.println("Course Name: " + courseName);

        System.out.println("Instructor 1: " + instructor1.getFirstName() + " " + instructor1.getLastName());

        System.out.println("Instructor 2: " + instructor2.getFirstName() + " " + instructor2.getLastName());

        System.out.println("Textbook 1: " + textbook1.getTitle() + " by " + textbook1.getAuthor());

        System.out.println("Textbook 2: " + textbook2.getTitle() + " by " + textbook2.getAuthor());
    }

}
