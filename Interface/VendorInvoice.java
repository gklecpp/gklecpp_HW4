package Interface;

public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue){
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }

    public String getVendorName(){
        return vendorName;
    }

    public String getInvoiceNumber(){
        return invoiceNumber;
    }

    public double getAmountDue(){
        return amountDue;
    }

    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue){
        if(amountDue >= 0){
            this.amountDue = amountDue;
        }
    }

    @Override 
    public double calculatePayment(){
        return amountDue;
    }

    @Override 
    public String getPayeeName(){
        return vendorName;
    }

    public void print(){
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Payment: $" + calculatePayment());

    }
    
}
