package y2025.july.starter194;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int result = Math.min(arr[0], arr[N - 1]);
            Arrays.sort(arr);
            if (arr[0] + arr[1] < result) {
                result = arr[0] + arr[1];
            }
            System.out.println(result);
        }
    }
}
