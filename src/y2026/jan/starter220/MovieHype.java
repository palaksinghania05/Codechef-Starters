package y2026.jan.starter220;

import java.util.Scanner;

public class MovieHype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 0; i <= N; i++) {
                A[i] = sc.nextInt();
            }
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int temp = Math.max(A[i], A[i + 1]);
                result = Math.min(result, temp);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
