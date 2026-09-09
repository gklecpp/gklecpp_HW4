package Composition;

// represents  file that can belong inside a Folder
public class File {
    // stores the name of the file
    private String name;

    // constructor used to create a File object
    public File(String name){
        this.name = name;
    }

    // return the file's name
    public String getName(){
        return name;
    }

    // change the file's name
    public void setName(String name){
        this.name = name;
    }

    // print the file's name
    public void print(){
        System.out.println(name);
    }
}
