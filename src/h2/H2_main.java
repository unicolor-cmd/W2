package h2;

public class H2_main {
    public static void main(String[] args) {
        // wir sollen 'else' oder sonstiges noch nicht benutzen?
        int i = 0;
        int j = 1;
        int k = 2;
        int min = 0;
        int max = 0;

        if (i < j) {
            if (i < k) {
                min = i;
            }
            if (i > k) {
                min = k;
            }

            if (j < k) {
                max = k;
            }
            if (j > k) {
                max = j;
            }
        }
        if (i > j) {
            if (i > k) {
                max = i;
            }
            if (i < k) {
                max = k;
            }

            if (j < k) {
                min = j;
            }
            if (j > k) {
                min = k;
            }
        }

        System.out.println("min:");
        System.out.println(min);
        System.out.println();

        System.out.println("max:");
        System.out.println(max);
        System.out.println();
    }
}
