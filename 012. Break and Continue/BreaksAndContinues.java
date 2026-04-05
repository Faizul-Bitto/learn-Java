public class BreaksAndContinues {

    public static void main(String[] args) {

        // break & continue

        int i = 0;

        while (true) {

            if (i == 5) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;

            if (i > 5) {
                break;
            }

        }
    }
}
