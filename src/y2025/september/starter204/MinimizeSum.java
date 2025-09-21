package y2025.september.starter204;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            Arrays.sort(A);
            long result = sum;
            int temp = 0;
            int index = N - 1;
            for (int k = 1; k < M; k++) {
                while (index >= 0 && M - A[index] == k) {
                    temp++;
                    index--;
                }
                long temp2 = sum + ((long) N * k - (long) M * temp);
                if (temp2 < result)
                    result = temp2;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
