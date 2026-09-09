package Polymorphism;

// CargoShip is a child class of Ship
public class CargoShip extends Ship{
    // Stores how many tons of cargo the ship can carry
    private int cargoCapacity;

    // constructor used to create a CargoShip
    public CargoShip(String name, String yearBuilt, int cargoCapacity){
        // calls the Ship constructor to initialize
        super(name, yearBuilt);
        // initialize the variable specific to CargoShip
        this.cargoCapacity = cargoCapacity;
    }

    // return the ship's cargo capacity
    public int getCargoCapacity(){
        return cargoCapacity;
    }
    // changes the ship's cargo capacity
    public void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }

    // replace the print method inherited from Ship with a version specifically for CargoShip
    @Override 
    public void print(){
        System.out.println("Ship Name: " + getName());
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}
