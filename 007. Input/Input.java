import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        // how to take input :
        Scanner sc = new Scanner(System.in);

        // taking int
        // System.out.println("Enter your age : ");
        // int age = sc.nextInt();
        // System.out.println(age);

        // taking string
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
