package y2025.december.starter215;

import java.util.Scanner;

public class DifferingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
            String S = sc.next();
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0')
                    count++;
            }
            int mod = N % K;
            int temp = (mod * (((N / K) + 1) / 2)) + ((K - mod) * ((N / K) / 2));
            System.out.println((count >= temp && (N - count) >= temp) ? "YES" : "NO");
        }
    }
}
