package y2025.april.starter184;

import java.util.Scanner;

public class FrontOrBack {
    public static void main(String[] args) {
        int mod = 998244353;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] count = new int[N];
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                count[a]++;
            }
            int result = 1;
            for (int i = 0; i < N / 2; i++) {
                if (count[i] + count[N - i - 1] != 2) {
                    result = 0;
                    break;
                }
                result *= 2;
                result %= mod;
            }
            System.out.println(result);
        }
    }
}
