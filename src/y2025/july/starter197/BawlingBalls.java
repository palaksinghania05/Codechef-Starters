package y2025.july.starter197;

import java.util.Scanner;

public class BawlingBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= X && A[i] <= Y) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
