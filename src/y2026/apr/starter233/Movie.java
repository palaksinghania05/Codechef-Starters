package y2026.apr.starter233;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int result;
            if (N >= M) {
                result = C * M;
                N = N - M;
                result += N * A;
            } else {
                result = C * N;
                M = M - N;
                result += M * B;
            }
            System.out.println(result);
        }
    }
}
