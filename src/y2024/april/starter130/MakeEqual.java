package y2024.april.starter130;

import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            long min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            if (arr[0] == min && arr[N - 1] == min) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
    }
}
