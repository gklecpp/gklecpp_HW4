package Composition;

public class Main {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("Source Files");
        
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        File htacess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        publicFolder.addFile(htacess);
        publicFolder.addFile(htrouter);
        publicFolder.addFile(index);

        System.out.println("Original Structure:");
        phpDemo1.print("");

        System.out.println();
        System.out.println("After deleting app:");
        sourceFiles.deleteSubFolder("public");
        phpDemo1.print("");
    }
}
