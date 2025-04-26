package y2025.april.starter183;

import java.util.Scanner;

public class LargerSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }
            System.out.println(Math.max(max - min - 1, 0));
        }
    }
}
