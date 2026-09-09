package Polymorphism;

public class Main {
    public static void main(String[] args){
        // create an array of Ship references
        Ship[] ships = new Ship[3];

        // store a regular Ship object in the array
        ships[0] = new Ship("USS Midway", "1943");
        // store a CruiseShip object in the array
        ships[1] = new CruiseShip("Icon of the Seas", "2022", 5610);
        // store a CargoShip object in the array
        ships[2] = new CargoShip("HMM Algeciras", "2020", 23964);

        // loop through every Ship object in the array and print
        for (Ship ship : ships){
            ship.print();
            System.out.println();
        }
    }
}
