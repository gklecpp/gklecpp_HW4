package Polymorphism;

// CruiseShip child class of Ship
public class CruiseShip extends Ship {
    // stores max number of passageners the ship can hold
    private int maxPassengers;

    // constructor used to create a CruiseShip
    public CruiseShip(String name, String yearBuilt, int maxPassengers){
        // calls the Ship constructor to initialize
        super(name, yearBuilt);
        // initialize the variable specific to CruiseShip
        this.maxPassengers = maxPassengers;
    }

    // returns max number of passengers
    public int getMaxPassengers(){
        return maxPassengers;
    }

    // changes max number of passengers
    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    // replace the print method inherited from Ship with a version specifically for CruiseShip
    @Override
    public void print(){
        System.out.println("Ship Name: " + getName());
        System.out.println("Maximum Passengers: " + getMaxPassengers());
    }
}
