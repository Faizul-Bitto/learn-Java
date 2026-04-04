public class ConditionalStatement {

    public static void main(String[] args) {

        boolean isStudent = true;

        if (isStudent) {
            System.out.println("I am a student");
        } else {
            System.out.println("I am not a student");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
