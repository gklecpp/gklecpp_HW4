package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        Freelancer freelancer1 = new Freelancer("Alex", "Johnson", 30.00, 35);

        Freelancer freelancer2 = new Freelancer("Taylor", "Smith", 28.00, 45);

        VendorInvoice invoice1 = new VendorInvoice("Office Depot", "INV-1001", 850.00);
    
        VendorInvoice invoice2 = new VendorInvoice("Tech Supplies Inc.", "INV-1002", 1250.00);

        payables.add(freelancer1);
        payables.add(freelancer2);
        payables.add(invoice1);
        payables.add(invoice2);
    
        double totalPayout = 0;

        for (Payable payable : payables){
            if (payable instanceof Freelancer){
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }

            totalPayout += payable.calculatePayment();

            System.out.println();
        }

        System.out.println("Total Payout: $" + totalPayout);
    }

}
