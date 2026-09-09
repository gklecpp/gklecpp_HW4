package Aggregation;

public class Main {
    public static void main(String[] args) {
        // create the Instructor objects separately
        // can exist without a Course
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");

        Instructor instructor2 = new Instructor("Tingting", "Chen", "8-14");

        // create the Textbook objects separately
        // can exist without a Course
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Textbook textbook2 = new Textbook("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides", "Addison-WEsley Professional");

        // create the course and give it an instructor and Textbook objects that were created
        Course course = new Course("Advanced Software Engineering", instructor1, instructor2, textbook1, textbook2);
        // print the course along with the instructor and textbooks
        course.print();
    }
    
}
