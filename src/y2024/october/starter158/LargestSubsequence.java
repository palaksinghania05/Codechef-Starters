package y2024.october.starter158;

import java.util.Scanner;

public class LargestSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    result = Math.max(result, i + 1);
                } else if (S.charAt(i) == S.charAt(S.length() - 1)) {
                    result = Math.max(result, N - i);
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
