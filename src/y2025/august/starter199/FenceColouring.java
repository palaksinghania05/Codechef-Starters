package y2025.august.starter199;

import java.util.Scanner;

public class FenceColouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N + 1];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[A[i]]++;
                if (A[i] != 1) temp++;
            }
            int result = temp;
            for (int c = 1; c <= N; c++) {
                int time = 1 + (N - B[c]);
                result = Math.min(result, time);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
