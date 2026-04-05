public class ExceptionHandlingWithTryCatch {

    public static void main(String[] args) {

        int[] marks = { 10, 20, 30 };

        try {
            System.out.println(marks[6]);
        } catch (Exception exception) {
            // do something after catching
        }

        System.out.println(marks[2]);
    }
}
