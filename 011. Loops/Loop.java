public class Loop {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // while loop
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int j = 10;

        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        // do while loop
        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        int l = 10;

        do {
            System.out.println(l);
            l--;
        } while (l >= 1);
    }
}
