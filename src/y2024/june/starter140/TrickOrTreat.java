package y2024.june.starter140;

import java.util.Scanner;

public class TrickOrTreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int[] tempArr1 = new int[M];
            int[] tempArr2 = new int[M];
            for (int i = 0; i < M; i++) {
                tempArr1[i] = 0;
                tempArr2[i] = 0;
            }
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                tempArr1[A[i] % M]++;
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
                tempArr2[B[i] % M]++;
            }
            long result = (long) tempArr1[0] * tempArr2[0];
            for (int i = 1; i < M; i++) {
                result += (long) tempArr1[i] * tempArr2[M - i];
            }
            System.out.println(result);
            T--;
        }
    }
}
