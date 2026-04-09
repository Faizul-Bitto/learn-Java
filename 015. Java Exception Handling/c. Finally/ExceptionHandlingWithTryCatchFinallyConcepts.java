public class ExceptionHandlingWithTryCatchFinallyConcepts {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println(result);

        } catch (NullPointerException e) { // this is ArithmeticException, but we are putting a wrong exception, as it
                                           // is
                                           // wrong, it will not work and next lines of codes will not execute. We want
                                           // that next lines should execute, so we will use finally

            System.out.println("Exception : " + e);
        } finally {
            System.out.println("Last line of the program");
        }
    }
}
