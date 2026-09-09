package Interface;

// Freelancer implements the Payable interface
// Freelancer must provide calculatePayment() and getPayeeName()
public class Freelancer implements Payable {
    // store the freelancers first name, last name, hourly rate, and hours worked
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    // constructor for creating a freelancer object
    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;

        // use setters so validation inside the setters is also used
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    // returns the freelancers first name, last name, hourly rate, and hours worked
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    // changes freelancers first name, last name, hourly rate, and hours worked
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setHourlyRate(double hourlyRate){
        // condition is the hourly rate will change only if it is not negative
        if (hourlyRate >= 0){
            this.hourlyRate = hourlyRate;
        }
    }

    public void setHoursWorked(double hoursWorked){
        // condition is the hours worked will change only if it is not negative
        if (hoursWorked >= 0){
            this.hoursWorked = hoursWorked;
        }
    }

    // @Override means this method comes from the Payable interface
    @Override 
    public String getPayeeName(){
        return firstName + " " + lastName;
    }

    // provides Freelancer's version of calculatePayment()
    @Override 
    public double calculatePayment(){

        // if freelancer worked 40 hours or less calculate normal pay
        if (hoursWorked <= 40){
            return hourlyRate * hoursWorked;
        }else{
            // calculate normal pay for the first 40 hours
            double regularPay = hourlyRate * 40;
            // find  how many hours were overtime
            double overtimeHours = hoursWorked - 40;
            // overtime is paid at 1.5 times the hourly rate
            double overtimePay = overtimeHours * hourlyRate * 1.5;
            //return normal pay plus overtime pay
            return regularPay + overtimePay;
        }
    }

    // print the freelancer's name and calculated payment
    public void print(){
        System.out.println("Freelancer: " + getPayeeName());
        System.out.println("Payment: $" + calculatePayment());
    }

}
