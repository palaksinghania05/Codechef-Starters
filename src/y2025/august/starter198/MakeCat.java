package y2025.august.starter198;

import java.util.Scanner;

public class MakeCat {
    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        System.out.println(S.length() == 3 && S.contains("c") && S.contains("a") && S.contains("t") ? "YES" : "NO");
    }
}
