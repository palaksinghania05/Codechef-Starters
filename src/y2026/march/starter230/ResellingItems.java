package y2026.march.starter230;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ResellingItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            Integer[] A = new Integer[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A, Collections.reverseOrder());
            long maxProfit = 0;
            for (int i = 0; i < N; i++) {
                if (i < K) {
                    if (A[i] > 5) {
                        maxProfit += (A[i] - 5);
                    }
                } else {
                    if (A[i] > 10) {
                        maxProfit += (A[i] - 10);
                    }
                }
            }
            System.out.println(maxProfit);
        }
    }
}
