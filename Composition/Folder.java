package Composition;

import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name){
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addFile(File file){
        files.add(file);
    }

    public void addSubFolder(Folder folder){
        subFolders.add(folder);
    }

    public void deleteSubFolder(String folderName){
        for (int i = 0; i < subFolders.size(); i++){
            if (subFolders.get(i).getName().equals(folderName)){
                subFolders.remove(i);
                return;
            }
        }
    }

    public void print(String indent){
        System.out.println(indent + name);

        for (File file : files){
            System.out.println(indent + " " + file.getName());
        }

        for (Folder folder : subFolders){
            folder.print(indent + " ");
        }
    }
}
