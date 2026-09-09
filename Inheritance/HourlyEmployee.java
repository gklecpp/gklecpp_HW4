package Inheritance;

// HourlyEmployee another child class of Employee
public class HourlyEmployee extends Employee {
    // stores the employee's wage and the hours an employee has worked
    private double wage;
    private double hoursWorked;

    // constructor for creating an hourly employee
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked){
        // calls the Employee constructor to initialize
        super(firstName, lastName, socialSecurityNumber);

        // initialize wage and the hours worked
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // return the wage and hours worked
    public double getWage(){
        return wage;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }

    // changes the wage and the hours worked
    public void setWage(double wage){
        this.wage = wage;
    }
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
}
