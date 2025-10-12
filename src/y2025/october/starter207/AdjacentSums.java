package y2025.october.starter207;

import java.util.Scanner;

public class AdjacentSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long[] dynamic = new long[N];
            dynamic[0] = A[0];
            for (int i = 1; i < N; i++) {
                long adjEqual = Math.abs(A[i] - A[i - 1]);
                if (i - 2 >= 0)
                    adjEqual += A[i - 2];
                if (i - 3 >= 0)
                    adjEqual += dynamic[i - 3];
                long makeZero = A[i] + dynamic[i - 1];
                dynamic[i] = Math.min(makeZero, adjEqual);
            }
            System.out.println(dynamic[N - 1]);
        }
    }
}
