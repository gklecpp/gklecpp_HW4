package Composition;

public class Main {
    public static void main(String[] args) {

        //create the root folder
        Folder phpDemo1 = new Folder("Source Files");

        // create the folders that will belong inside the main folder
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        // add these folders as subfolders of the main folder
        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        // create more folders that will belong inside Source Files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // add the folders inside Source Files
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        // create files that will belong inside the public folder
        File htacess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        // add the files to the public folder
        publicFolder.addFile(htacess);
        publicFolder.addFile(htrouter);
        publicFolder.addFile(index);

        // print complete folder structure before deleting anything
        System.out.println("Original Structure:");
        phpDemo1.print("");

        // delete one of the subfolders from Source Files
        System.out.println();
        System.out.println("After deleting app:");
        sourceFiles.deleteSubFolder("public");
        // print the structure again to show that the selected folder has been removed
        phpDemo1.print("");
    }
}
