package y2026.apr.starter233;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class KMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            int M = N - K;
            int temp = (M + 1) / 2 - 1;
            TreeSet<Integer> medians = new TreeSet<>();
            for (int i = temp; i <= temp + K && i < N; i++) {
                medians.add(A[i]);
            }
            for (int val : medians) {
                System.out.print(val + " ");
            }
        }
    }
}
