package y2025.october.starter210;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FirstElementCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] A = new int[N][2];
            for (int i = 0; i < N; i++) {
                A[i][0] = sc.nextInt();
                A[i][1] = i;
            }
            Arrays.sort(A, Comparator.comparingInt(a -> a[0]));
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                int j = A[i][1];
                if (i == 0 || i == N - 1) {
                    result[j] = -1;
                } else {
                    int prev = A[i - 1][0];
                    int next = A[i + 1][0];
                    int temp = A[i][0];
                    result[j] = (temp - prev - 1) / 2 + (next - temp) / 2 + 1;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
