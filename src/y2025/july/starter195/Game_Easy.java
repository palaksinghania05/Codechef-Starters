package y2025.july.starter195;

import java.util.Arrays;
import java.util.Scanner;

public class Game_Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            Arrays.sort(A);
            long[] B = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                B[i] = B[i - 1] + A[N - i];
            }
            for (int i = 1; i <= 2 * N; i++) {
                long result = 0;
                int temp = Math.min(i / 2, N);
                for (int j = 0; j <= temp; j++) {
                    int temp2 = i - 2 * j;
                    int temp3 = temp2 + j;
                    if (temp2 < 0 || temp3 > N)
                        continue;
                    long normalSum = B[temp3];
                    long bonusSum = (long) j * temp2 + (long) j * (j - 1) / 2;
                    long totalSum = normalSum + bonusSum;
                    if (totalSum > result)
                        result = totalSum;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
