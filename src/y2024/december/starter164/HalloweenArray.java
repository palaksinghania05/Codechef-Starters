package y2024.december.starter164;

import java.util.Arrays;
import java.util.Scanner;

public class HalloweenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long L = sc.nextLong();
            long R = sc.nextLong();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            boolean flag = false;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                if (L <= 0 && R >= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            long temp = 1;
            boolean flag2 = false;
            outer:
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    long xor = arr[i] ^ arr[j];
                    temp *= xor;
                    if (temp > R) {
                        flag2 = true;
                        break outer;
                    }
                }
            }
            if (flag2 || temp < L || temp > R) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
