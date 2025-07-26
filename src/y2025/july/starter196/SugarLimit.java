package y2025.july.starter196;

import java.util.Scanner;

public class SugarLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
                if (B[i] > max) {
                    max = B[i];
                }
            }
            int result = 0;
            for (int i = 1; i <= max; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    if (B[j] <= i && A[j] > 0) {
                        temp += A[j];
                    }
                }
                result = Math.max(result, temp - i);
            }
            System.out.println(result);
        }
    }
}
