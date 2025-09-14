package y2025.september.starter203;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumMST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = N * (N - 1) / 2;
            int[] A = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            int count = 0;
            int i = 0;
            int result = 0;
            while (i < M) {
                result += A[i];
                count++;
                i += count;
            }
            System.out.println(result);
        }
    }
}
