package Polymorphism;

// parent class that stores information shared by all types of ships
public class Ship {
    // store ships name and year build
    private String name;
    private String yearBuilt;

    // constructor used to create an Ship object
    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // return the ship's name and year built
    public String getName(){
        return name;
    }

    public String getYearBuilt(){
        return yearBuilt;
    }

    // change the ship's name and year built
    public void setName(String name){
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    // display the basic information for a Ship
    // child classes can override this method with their own version
    public void print(){
        System.out.println("Ship Name: " + name);
        System.out.println("Year Biult: " + yearBuilt);
    }

}
