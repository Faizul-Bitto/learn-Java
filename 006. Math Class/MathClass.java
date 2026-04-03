public class MathClass {

    public static void main(String[] args) {

        // max
        System.out.println(Math.max(100, 50));

        // min
        System.out.println(Math.min(100, 50));

        // random (long form)
        System.out.println(Math.random()); // between 0.0 to 1.0 -> returns in long form
        // random (int form)
        System.out.println((int) (Math.random() * 100)); // between 0 to 100 -> returns in int form
    }
}