package y2025.december.starter216;

import java.util.Arrays;
import java.util.Scanner;

public class XOREqualSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                int[] A = new int[N];
                for (int i = 0; i < N; i++) {
                    A[i] = sc.nextInt();
                }
                Arrays.sort(A);
                int[] dp = new int[N];
                int result = 0;
                for (int i = 0; i < N; i++) {
                    dp[i] = 1;
                    for (int j = 0; j < i; j++) {
                        if ((A[i] & A[j]) == A[j]) {
                            dp[i] = Math.max(dp[i], dp[j] + 1);
                        }
                    }
                    if (dp[i] > result) {
                        result = dp[i];
                    }
                }
                System.out.println(result);
            }
        }
    }
}
