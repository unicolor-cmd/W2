package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = -10;
        boolean expression1 = (i > j);
        boolean expression2 = (i > 200);
        boolean expression3 = (j > 100);
        if (expression1 && !expression2 && !expression3) {
            k = 1;
        } else if (expression1 && expression2 && !expression3) {
            k = 2;
        } else if (expression1 && expression2 && expression3) {
            k = 3;
        } else if (!expression1 && !expression2 && !expression3) {
            k = 4;
        }
    }
}
