package Interface;

// interface defines what any payable object must be able to do
// any class that implement payable must provide these 2 methods
public interface Payable {

    // calculates how much money should be paid
    double calculatePayment();

    // returns the name of the person or company being paid
    String getPayeeName();

}
