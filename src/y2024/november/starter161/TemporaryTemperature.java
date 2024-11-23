package y2024.november.starter161;

import java.util.Scanner;

public class TemporaryTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int low = 0, high = 1_000_000_000, result = high;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (isPossible(A, N, K, mid)) {
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(result);
            T--;
        }
    }

    private static boolean isPossible(int[] A, int N, int K, int D) {
        int changes = 0;
        int minTemp = A[0] - D, maxTemp = A[0] + D;
        for (int i = 1; i < N; i++) {
            int currentMin = A[i] - D, currentMax = A[i] + D;
            minTemp = Math.max(minTemp, currentMin);
            maxTemp = Math.min(maxTemp, currentMax);
            if (minTemp > maxTemp) {
                changes++;
                minTemp = currentMin;
                maxTemp = currentMax;
            }
            if (changes > K) return false;
        }
        return true;
    }
}
