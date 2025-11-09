package y2025.november.starter211;

import java.util.Arrays;
import java.util.Scanner;

public class NoDoubling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int i = 0, j = N - 1;
            while (i < j) {
                System.out.print(arr[i] + " " + arr[j] + " ");
                i++;
                j--;
            }
            if (N % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
