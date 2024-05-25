package y2024.may.starter135;

import java.util.Scanner;

public class InvertAndEqualize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int result = 0;
            int N = sc.nextInt();
            String S = sc.next();
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) != S.charAt(i - 1)) {
                    result++;
                }
            }
            System.out.println((result + 1) / 2);
        }
    }
}
