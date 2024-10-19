package y2024.october.starter156;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionScore {
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
            Arrays.sort(arr);
            if (K <= 1) {
                System.out.println(arr[0] + arr[N - 1] + arr[N - 2] + arr[N - 1]);
            } else {
                System.out.println(arr[0] + arr[N - 1] + arr[N - 2] + arr[N - 2 - K + 1]);
            }
            T--;
        }
    }
}
