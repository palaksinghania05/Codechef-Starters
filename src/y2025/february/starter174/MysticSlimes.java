package y2025.february.starter174;

import java.util.Scanner;

public class MysticSlimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            if (N == 2) {
                System.out.println(Math.abs(A[0] - A[1]));
                continue;
            }
            int result = 0;
            result = Math.max(result, A[0]);
            result = Math.max(result, A[N - 1]);
            for (int i = 1; i < N - 1; i++) {
                int temp = 0;
                if (i == 1)
                    temp += A[0];
                if (i == N - 2)
                    temp += A[N - 1];
                int candidate = A[i] - temp;
                result = Math.max(result, candidate);
            }
            System.out.println(result);
        }
    }
}
