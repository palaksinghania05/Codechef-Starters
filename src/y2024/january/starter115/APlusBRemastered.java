package y2024.january.starter115;

import java.util.Arrays;
import java.util.Scanner;

public class APlusBRemastered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            int count = N;
            int sum = A[0] + B[N - 1];
            for (int i = 0, j = N - 1; i < N; i++, j--) {
                if (sum != (A[i] + B[j])) {
                    System.out.println(-1);
                    break;
                } else {
                    count--;
                }
            }
            if (count == 0) {
                for (int i = 0; i < N; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(B[j] + " ");
                }
                System.out.println();
            }
            T--;
        }
    }
}
