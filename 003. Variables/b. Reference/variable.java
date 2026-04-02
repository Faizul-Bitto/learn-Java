import java.util.Arrays;

public class variable {
    public static void main(String[] args) {

        String name = "Hello World!";

        // concatenation
        System.out.println("Name is : " + name);

        // length
        System.out.println(name.length());

        // position
        System.out.println(name.charAt(0));

        // replace
        String name2 = name.replace('o', 'u');
        System.out.println("Name is : " + name2);

        // substring
        System.out.println(name.substring(0, 5));

        // array
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 93;
        marks[2] = 95;

        System.out.println(marks[2]);

        boolean[] marks2 = new boolean[3];
        // marks[0] = 97;
        // marks[1] = 93;
        // marks[2] = 95;

        System.out.println(marks2[2]);
        // length
        System.out.println(marks.length);
        // sort
        System.out.println(marks[0]); // before
        Arrays.sort(marks);
        System.out.println(marks[0]); // after sorted

        // arrays
        int[] marks3 = { 10, 20, 30 };
        System.out.println(marks3[0]);

        // 2D arrays
        int[][] marks4 = { { 10, 20, 30 }, { 40, 50, 60 } };
        System.out.println(marks4[0][2]);
        System.out.println(marks4[1][1]);
    }
}
