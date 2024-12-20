package y2024.december.starter165;

import java.util.Scanner;

public class PosterParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int result = Integer.MAX_VALUE;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    int temp = 2 * (i + j);
                    int difference = Math.abs(temp - K);
                    result = Math.min(result, difference);
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
