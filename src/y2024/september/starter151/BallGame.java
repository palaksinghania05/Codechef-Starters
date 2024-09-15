package y2024.september.starter151;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BallGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            for (int i = 0; i < N; i++)
                B[i] = sc.nextInt();
            long[][] arr = new long[N][2];
            for (int i = 0; i < N; i++) {
                arr[i][0] = A[i];
                arr[i][1] = B[i];
            }
            Arrays.sort(arr, Comparator.comparingLong(x -> x[0]));
            int result = 1;
            long[] previous = arr[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                long[] current = arr[i];
                if (current[0] * previous[1] <= previous[0] * current[1]) {
                    result++;
                    previous = current;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
