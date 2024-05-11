package y2024.may.starter133;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAlternatingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int odd = 0, even = 0;
            for (int k = 0; k < N; k++) {
                if (k < N / 2) {
                    odd += arr[k];
                } else {
                    even += arr[k];
                }
            }
            System.out.println(even - odd);
            T--;
        }
    }
}
