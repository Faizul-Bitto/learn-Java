public class FunctionsOrMethods {

    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void summation(int a, int b) {
        System.out.println(a + b);
    }

    public static int calculateSum(int c, int d) {
        int summation = c + d;
        return summation;
    }

    public static void main(String[] args) {
        printJava();
        printName("John");
        summation(10, 10);

        int result = calculateSum(5, 10);
        System.out.println(result);
    }
}
