package y2026.apr.starter234;

import java.util.*;

public class NonNegativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            if (sum >= 0) {
                System.out.println(N);
            } else {
                Arrays.sort(A);
                int count = N;
                for (int i = 0; i < N && sum < 0; i++) {
                    if (A[i] < 0) {
                        sum -= A[i];
                        count--;
                    }
                }
                System.out.println(sum >= 0 ? count : 0);
            }
        }
    }
}
