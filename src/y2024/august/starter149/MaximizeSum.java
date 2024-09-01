package y2024.august.starter149;

import java.util.Scanner;

public class MaximizeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int count = 0;
            long max = Integer.MAX_VALUE;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    count++;
                }
                max = Math.min(max, Math.abs(arr[i]));
                sum += Math.abs(arr[i]);
            }
            if (count % 2 != 0) {
                max *= 2;
                System.out.println(sum - max);
            } else {
                System.out.println(sum);
            }
            T--;
        }
    }
}
