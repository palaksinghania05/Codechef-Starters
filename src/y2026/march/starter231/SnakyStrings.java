package y2026.march.starter231;

import java.util.Scanner;

public class SnakyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.startsWith("s") || S.endsWith("s")) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}
