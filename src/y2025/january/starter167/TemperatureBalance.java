package y2025.january.starter167;

import java.util.Scanner;

public class TemperatureBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            long result = 0;
            for (int i = 0; i < N; i++) {
                if (i >= 1) {
                    int num = sc.nextInt();
                    arr[i] = arr[i - 1] + num;
                } else {
                    int num = sc.nextInt();
                    arr[i] = num;
                }
            }
            for (long l : arr) {
                result += Math.abs(l);
            }
            System.out.println(result);
            T--;
        }
    }
}
