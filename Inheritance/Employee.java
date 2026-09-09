package Inheritance;

// parent class that stores information shared by all employee types
public class Employee {
    // basic infomration every employee has
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // constructor used to create an Employee object
    public Employee (String firstName, String lastName, String socialSecurityNumber) {
        // this refers to the current object's variable
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // getters return employee information
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    // setters allows the employee's information to be changed
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
