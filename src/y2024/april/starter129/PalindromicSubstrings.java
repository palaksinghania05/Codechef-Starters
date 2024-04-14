package y2024.april.starter129;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            if (N == 1) {
                System.out.println("Bob");
                continue;
            }
            int c1 = 0, c2 = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    c1++;
                } else {
                    c2++;
                }
            }
            int temp = Math.abs(c1 - c2);
            if (N % 2 == 0) {
                if (temp >= 2) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            } else {
                if (temp >= 2) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            }
        }
    }
}
