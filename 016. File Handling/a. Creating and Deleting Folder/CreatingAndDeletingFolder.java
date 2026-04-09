import java.io.File;

public class CreatingAndDeletingFolder {

    public static void main(String[] args) {

        // creating a folder
        File folder = new File("D:/learn-Java/016. File Handling/a. Creating and Deleting Folder/Folder");
        folder.mkdir();

        String folderLocation = folder.getAbsolutePath();
        System.out.println(folderLocation);

        String folderName = folder.getName();
        System.out.println(folderName);

        if (folder.delete()) {
            System.out.println("Folder Deleted.");
        }
    }
}
