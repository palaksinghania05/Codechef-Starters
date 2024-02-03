package y2024.february.starter119;

import java.util.Scanner;

public class CookieDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int element = sc.nextInt();
                if (K < element) {
                    result = Math.min(result, element % K);
                }
            }
            if (result == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(result);
            }
            T--;
        }
    }
}
