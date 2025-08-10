package y2025.august.starter198;

import java.util.Scanner;

public class MinimizeMaximizeMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            boolean[] temp1 = new boolean[N];
            boolean[] temp2 = new boolean[N];
            for (int i = 0; i < N; i++) {
                temp1[A[i]] = true;
                temp1[B[i]] = true;
                if (A[i] == B[i]) {
                    temp2[A[i]] = true;
                }
            }
            int[] temp3 = new int[N];
            int count = 0, result = N;
            for (int i = 0; i < N; i++) {
                if (temp1[i] && !temp2[i]) {
                    count++;
                }
                temp3[i] = count;
            }
            for (int i = 0; i <= N; i++) {
                if (i == N) break;
                if (!temp1[i]) {
                    result = i;
                    break;
                }
                if (temp3[i] >= 2) {
                    result = i;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
