package y2025.december.starter218;

import java.util.Scanner;

public class DeletingArrayAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] C = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            for (int i = 0; i < N; i++)
                C[i] = sc.nextInt();
            long result = 0;
            int minC = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                minC = Math.min(minC, C[i]);
                result += (long) A[i] * minC;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
