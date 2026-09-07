package Interface;

public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

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

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setHourlyRate(double hourlyRate){
        if (hourlyRate >= 0){
            this.hourlyRate = hourlyRate;
        }
    }

    public void setHoursWorked(double hoursWorked){
        if (hoursWorked >= 0){
            this.hoursWorked = hoursWorked;
        }
    }

    @Override 
    public String getPayeeName(){
        return firstName + " " + lastName;
    }

    @Override 
    public double calculatePayment(){
        if (hoursWorked <= 40){
            return hourlyRate * hoursWorked;
        }else{
            double regularPay = hourlyRate * 40;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * hourlyRate * 1.5;

            return regularPay + overtimePay;
        }
    }

    public void print(){
        System.out.println("Freelancer: " + getPayeeName());
        System.out.println("Payment: $" + calculatePayment());
    }

}
