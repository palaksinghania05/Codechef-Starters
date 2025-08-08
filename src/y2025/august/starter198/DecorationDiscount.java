package y2025.august.starter198;

import java.util.Scanner;

public class DecorationDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int result = 100000;
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    if (j == i) continue;
                    if (j == i + 1) temp = arr[i] + arr[j] / 2;
                    else temp = arr[i] + arr[j];
                    result = Math.min(temp, result);
                }
            }
            System.out.println(result);
        }
    }
}
