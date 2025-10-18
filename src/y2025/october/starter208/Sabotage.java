package y2025.october.starter208;

import java.util.Arrays;
import java.util.Scanner;

public class Sabotage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int temp = X;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            temp = temp + 100 * K;
            int result = 1;
            for (int j = N - K - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
