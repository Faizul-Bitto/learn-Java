import java.io.File;

// super most class is "object" class

// all the exceptions has a super most class -> "Exception" class

public class TypesOfExceptions {

    public static void main(String[] args) {

        // ArithmeticException
        int x = 10;
        int y = 0;
        System.out.println(x / y);

        // NullPointerException
        String name = null;
        System.out.println(name.charAt(0));

        // StringIndexOutOfBoundException
        String name2 = "John";
        System.out.println(name2.charAt(6));

        // NumberFormatException
        int num = Integer.parseInt("Jane");
        System.out.println(num);

        // FileNotFoundException
        File file = new File("D://file.txt");

        // ArrayIndexOutOfBoundException
        int[] a = new int[5];
        a[10] = 10;
    }
}
