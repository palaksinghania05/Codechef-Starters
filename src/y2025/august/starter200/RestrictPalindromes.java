package y2025.august.starter200;

import java.util.Scanner;

public class RestrictPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String S = "abcde";
        while (T-- > 0) {
            int N = sc.nextInt();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                result.append(S.charAt(i % 5));
            }
            System.out.println(result);
        }
    }
}
