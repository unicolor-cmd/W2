package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = 2;
        int min = 0;
        int max = 0;

        if (i < j) {
            if (i < k) {
                min = i;
            } else {
                min = k;
            }

            if (j < k) {
                max = k;
            } else {
                max = j;
            }
        } else {
            if (i > k) {
                max = i;
            } else {
                max = k;
            }

            if (j < k) {
                min = j;
            } else {
                min = k;
            }
        }

        /*System.out.println("min:");
        System.out.println(min);
        System.out.println();

        System.out.println("max:");
        System.out.println(max);
        System.out.println();*/
    }
}
