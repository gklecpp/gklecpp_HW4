package Inheritance;

public class Main {
    public static void main(String[] args) {

        // creat different types of employee objects
        // each class inherits from the basic employee information
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);

        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);

        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);

        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);

        BaseEmployee employee5 = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 1700);

        SalariedEmployee employee6 = new SalariedEmployee("Mike", "Davenport", "666-66-6666", 95000);

        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        //display the information of the employees
        System.out.println("Employee 1:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Social Security Number: " + employee1.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + employee1.getWeeklySalary());
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Social Security Number: " + employee2.getSocialSecurityNumber());
        System.out.println("Wage: $" + employee2.getWage());
        System.out.println("Hours Worked: " + employee2.getHoursWorked());
        System.out.println();

        System.out.println("Employee 3:");
        System.out.println(employee3.getFirstName() + " " + employee3.getLastName());
        System.out.println("Social Security Number: " + employee3.getSocialSecurityNumber());
        System.out.println("Wage: $" + employee3.getWage());
        System.out.println("Hours Worked: " + employee3.getHoursWorked());
        System.out.println();

        System.out.println("Employee 4:");
        System.out.println(employee4.getFirstName() + " " + employee4.getLastName());
        System.out.println("Social Security Number: " + employee4.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + (employee4.getCommissionRate() * 100) + "%");
        System.out.println("Gross Sales: $" + employee4.getGrossSales());
        System.out.println();

        System.out.println("Employee 5:");
        System.out.println(employee5.getFirstName() + " " + employee5.getLastName());
        System.out.println("Social Security Number: " + employee5.getSocialSecurityNumber());
        System.out.println("Base Salary: $" + employee5.getBaseSalary());
        System.out.println();

        System.out.println("Employee 6:");
        System.out.println(employee6.getFirstName() + " " + employee6.getLastName());
        System.out.println("Social Security Number: " + employee6.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + employee6.getWeeklySalary());
        System.out.println();

        System.out.println("Employee 7:");
        System.out.println(employee7.getFirstName() + " " + employee7.getLastName());
        System.out.println("Social Security Number: " + employee7.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + (employee7.getCommissionRate() * 100) + "%");
        System.out.println("Gross Sales: $" + employee7.getGrossSales());
    }

}
