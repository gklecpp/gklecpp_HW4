package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create an ArrayList that can story any object that implements the Payable interface
        ArrayList<Payable> payables = new ArrayList<>();

        // creating 2 Freelancer objects and 2 VendorInvoice objects
        Freelancer freelancer1 = new Freelancer("Alex", "Johnson", 30.00, 35);

        Freelancer freelancer2 = new Freelancer("Taylor", "Smith", 28.00, 45);

        VendorInvoice invoice1 = new VendorInvoice("Office Depot", "INV-1001", 850.00);
    
        VendorInvoice invoice2 = new VendorInvoice("Tech Supplies Inc.", "INV-1002", 1250.00);

        // add both Freelancers and VendorInvoices to the same list
        payables.add(freelancer1);
        payables.add(freelancer2);
        payables.add(invoice1);
        payables.add(invoice2);

        // keep track of how much money needs to be paid in total
        double totalPayout = 0;

        // loop through every payable object in the list
        for (Payable payable : payables){
            // check if the Payable object is actually a Freelancer
            if (payable instanceof Freelancer){
                // Convert the Payable reference back into a Freelancer so we can call Freelancer's print method
                ((Freelancer) payable).print();
            }
            // else check if it is a VendorInvoice
            else if (payable instanceof VendorInvoice) {
                // convert it back into VendorInvoice so we can call its print method
                ((VendorInvoice) payable).print();
            }

            // every payable object has calculatePayment() so we can call it without using a specific class
            totalPayout += payable.calculatePayment();

            System.out.println();
        }

        // display the total amount paid to everyone
        System.out.println("Total Payout: $" + totalPayout);
    }

}
