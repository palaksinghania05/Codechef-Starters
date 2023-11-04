package y2023.november.starter106;

import java.util.Scanner;

public class PlayingWithOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = 0;
            int[] arr = new int[N + 1];
            int[] arr2 = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 1) {
                    arr2[i] = 1;
                }
                arr2[i] += arr2[i - 1];
            }
            for (int i = 1; i + K - 1 <= N; i++) {
                if (arr2[i + K - 1] - arr2[i - 1] > 0) {
                    result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
