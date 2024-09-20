package y2024.september.starter152;

import java.util.Arrays;
import java.util.Scanner;

public class RangeMinimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            if (N < 3) {
                System.out.println(0);
            } else {
                Arrays.sort(arr);
                int minRange = Math.min(
                        Math.min(arr[N - 1] - arr[2], arr[N - 3] - arr[0]),
                        Math.min(arr[N - 2] - arr[1], arr[N - 1] - arr[0])
                );
                System.out.println(minRange);
            }
            T--;
        }
    }
}
