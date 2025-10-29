package p1;

import java.util.Scanner;

public class P1_main {
    // 'psvm' adds public static void main(String[] args) {
    // cmd shift f in eclipse?
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zeile = new String();
        zeile = s.nextLine();
        System.out.println(zeile);
        s.close();
    }
}