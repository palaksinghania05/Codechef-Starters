package y2024.may.starter133;

import java.util.Scanner;

public class PoweredParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextLong();
            long result = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 1)
                    result += N;
                else {
                    for (int j = 0; j < N; j++) {
                        long val = (long) Math.pow(arr[i], j + 1);
                        if (val <= arr[j]) {
                            result++;
                        }
                        if (val > 1000000000L)
                            break;
                    }
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
