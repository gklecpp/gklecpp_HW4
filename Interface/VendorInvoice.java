package Interface;

// VendorInvoice implements the Payable interface
// VendorInvoice must provide calculatePayment() and getPayeeName()
public class VendorInvoice implements Payable {
    // stores the vendor name, invoice number, and amount due
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    // constructor for creating a vendor invoice object
    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue){
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        // use the setter so negative amounts are not accepted
        setAmountDue(amountDue);
    }

    // return the vendor name, invoice number, and amount due
    public String getVendorName(){
        return vendorName;
    }

    public String getInvoiceNumber(){
        return invoiceNumber;
    }

    public double getAmountDue(){
        return amountDue;
    }

    // changes the vendor name, invoice number, and amount due
    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue){
        // changes amount only if the due is not negative
        if(amountDue >= 0){
            this.amountDue = amountDue;
        }
    }

    // VendorInvoice's version of calculatePayment()
    @Override 
    public double calculatePayment(){
        return amountDue;
    }

    // returns the vendor as the person/company being paid
    @Override 
    public String getPayeeName(){
        return vendorName;
    }

    // prints information about the vendor invoice
    public void print(){
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Payment: $" + calculatePayment());

    }
    
}
