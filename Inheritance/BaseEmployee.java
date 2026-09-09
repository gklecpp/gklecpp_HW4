package Inheritance;

// BaseEmployee another child class of Employee
public class BaseEmployee extends Employee{
    // fixed salary belongs to a BaseEmployee
    private double baseSalary;

    // constructor for creating a BaseEmployee
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary){
        // calls the Employee constructor to initialize
        super(firstName, lastName, socialSecurityNumber);
        // initialize the BaseEmployee salary
        this.baseSalary = baseSalary;
    }

    // return the employee's base salary
    public double getBaseSalary(){
        return baseSalary;
    }

    // changes the employee's base salary
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
}
