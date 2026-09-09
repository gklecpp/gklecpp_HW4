package Aggregation;

// represents an instructor that can be assigned to a course
public class Instructor {
    // store the instructors first name, last name, office number
    private String firstName;
    private String lastName;
    private String officeNumber;

    // constructor used to create an Instructor object
    public Instructor(String firstName, String lastName, String officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;

    }

    // returns the instructors first name, last name, office number
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getOfficeNumber(){
        return officeNumber;
    }

    // changes the instructors first name, last name, office number
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setOfficeNumber(String officeNumber){
        this.officeNumber = officeNumber;
    }

}
