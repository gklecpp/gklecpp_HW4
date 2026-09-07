package Polymorphism;

public class Main {
    public static void main(String[] args){
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("USS Midway", "1943");

        ships[1] = new CruiseShip("Icon of the Seas", "2022", 5610);

        ships[2] = new CargoShip("HMM Algeciras", "2020", 23964);

        for (Ship ship : ships){
            ship.print();
            System.out.println();
        }
    }
}
