import java.util.Formatter;

public class WriteInFileConcept {

    public static void main(String[] args) {

        try {
            Formatter formatter = new Formatter("D:/learn-Java/016. File Handling/c. Write In File/student.txt");
            formatter.format("%s %s\r\n", "01", "John");
            formatter.format("%s %s\r\n", "02", "Jane");
            formatter.format("%s %s\r\n", "03", "Max");

            formatter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
