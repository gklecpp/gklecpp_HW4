package Inheritance;

// CommissionEmployee is the child class of Employee
public class CommissionEmployee extends Employee {
    // percentage of sales the employee earns and total amount of sales by the employee
    private double commissionRate;
    private double grossSales;

    // constructor for creating a commission employee
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales){
        // calls the Employee constructor to initialize
        super(firstName, lastName, socialSecurityNumber);
        // initialize variables that belong to CommissionEmployee
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // return's employee commission rate
    public double getCommissionRate(){
        return commissionRate;
    }

    // return's employee commission rate
    public double getGrossSales(){
        return grossSales;
    }

    // changes the commission rate and gross sales of an employee
    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }
}
