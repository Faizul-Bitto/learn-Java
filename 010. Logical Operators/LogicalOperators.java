public class LogicalOperators {

    public static void main(String[] args) {

        // logical operators

        // &&
        int a = 10;
        int b = 20;

        if (a < 50 && b < 50) {
            System.out.println("Both are less than 50");
        }

        // ||
        if (a < 50 || b < 50) {
            System.out.println("At least one less than 50");
        }
    }
}
