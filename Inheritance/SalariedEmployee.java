package Inheritance;

// SalariedEmployee another child class of Employee
public class SalariedEmployee extends Employee {
    // storing the employee's weekly salary
    private double weeklySalary;

    // constructor for creating a BaseEmployee
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        //calls the constructor from Employee
        super(firstName, lastName, socialSecurityNumber);
        // initializing the weekly salary
        this.weeklySalary = weeklySalary;
    }

    // return the weekly salary
    public double getWeeklySalary(){
        return weeklySalary;
    }

    // changes the weekly salary
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }
}
