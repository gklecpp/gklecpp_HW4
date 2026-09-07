package Polymorphism;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName(){
        return name;
    }

    public String getYearBuilt(){
        return yearBuilt;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    public void print(){
        System.out.println("Ship Name: " + name);
        System.out.println("Year Biult: " + yearBuilt);
    }

}
