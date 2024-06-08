package y2024.june.starter137;

import java.util.Scanner;

public class LargeDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int initialSum = 0;
            for (int i = 0; i < N - 1; i++) {
                initialSum += Math.abs(arr[i] - arr[i + 1]);
            }
            int result = initialSum;
            for (int i = 0; i < N; i++) {
                int temp = arr[i];
                int sum1 = initialSum;
                if (i > 0) {
                    sum1 -= Math.abs(temp - arr[i - 1]);
                    sum1 += Math.abs(1 - arr[i - 1]);
                }
                if (i < N - 1) {
                    sum1 -= Math.abs(temp - arr[i + 1]);
                    sum1 += Math.abs(1 - arr[i + 1]);
                }
                result = Math.max(result, sum1);
                int sum2 = initialSum;
                if (i > 0) {
                    sum2 -= Math.abs(temp - arr[i - 1]);
                    sum2 += Math.abs(K - arr[i - 1]);
                }
                if (i < N - 1) {
                    sum2 -= Math.abs(temp - arr[i + 1]);
                    sum2 += Math.abs(K - arr[i + 1]);
                }
                result = Math.max(result, sum2);
            }
            System.out.println(result);
            T--;
        }
    }
}
