package y2024.april.starter131;

import java.util.Arrays;
import java.util.Scanner;

public class KCloseness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                arr[i] %= K;
            }
            Arrays.sort(arr);
            int result = arr[N - 1] - arr[0];
            for (int i = 0; i < N - 1; i++) {
                result = Math.min(result, (arr[i] - arr[i + 1] + K));
            }
            System.out.println(result);
            T--;
        }
    }
}
