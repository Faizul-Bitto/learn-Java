import java.io.File;
import java.util.Scanner;

public class ReadFileConcept {

    public static void main(String[] args) {

        try {
            File file = new File("D:/learn-Java/016. File Handling/d. Read File/student.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String id = sc.next();
                String name = sc.next();

                System.out.println(" id : " + id + ", " + "name : " + name);
            }

            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
