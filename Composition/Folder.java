package Composition;

import java.util.ArrayList;

// represents a folder that can contain files and other folders
public class Folder {

    // stores the folder's name
    private String name;
    // stores all file objects that belong inside this folder
    private ArrayList<File> files;
    // stores all subfolders that belong inside the folder
    private ArrayList<Folder> subFolders;

    // constructor used to create a Folder
    public Folder(String name){
        this.name = name;
        // create empty lists for the files and subfolders
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    // return the folder's name
    public String getName(){
        return name;
    }

    // changes the folder's name
    public void setName(String name){
        this.name = name;
    }

    // adds a File object to this folder's list of files
    public void addFile(File file){
        files.add(file);
    }

    // adds another folder object inside this folder
    public void addSubFolder(Folder folder){
        subFolders.add(folder);
    }

    // searches for a subfolder with the given name and removes it from this folder
    public void deleteSubFolder(String folderName){
        // loop through ever subfolder
        for (int i = 0; i < subFolders.size(); i++){
            // comparing the current folder's name with the folder we want to delete
            if (subFolders.get(i).getName().equals(folderName)){
                // remove the matching folder from the list
                subFolders.remove(i);

                // stop searching once the folder is found
                return;
            }
        }
    }

    // prints this folder and everything inside it
    public void print(String indent){
        System.out.println(indent + name);

        // print every file that belongs directly to this folder
        for (File file : files){
            System.out.println(indent + " " + file.getName());
        }

        // each subfolder also prints its own files and subfolders
        for (Folder folder : subFolders){
            folder.print(indent + " ");
        }
    }
}
