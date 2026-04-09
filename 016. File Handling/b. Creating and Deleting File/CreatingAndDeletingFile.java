import java.io.File;

public class CreatingAndDeletingFile {

    public static void main(String[] args) {

        File file = new File("D:/learn-Java/016. File Handling/b. Creating and Deleting File/file.txt");

        try {
            file.createNewFile();
            System.out.println("File created.");
        } catch (Exception ex) {
            System.out.println(ex);
        }

        if (file.exists()) {
            System.out.println("File exists");
        }

        System.out.println(file.getAbsolutePath());

        file.delete();

        if (!file.exists()) {
            System.out.println("File doesn't exist");
        }
    }
}
