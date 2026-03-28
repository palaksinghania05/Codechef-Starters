package y2026.march.starter231;

import java.util.Scanner;

public class DoubleDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int result = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int sum = A[i] + A[j];
                    int temp1 = Math.max(A[i], A[j]) / 2;
                    int temp2 = 100;
                    int discount = Math.min(temp1, temp2);
                    int actualPrice = sum - discount;
                    if (actualPrice <= K) {
                        int tastiness = B[i] + B[j];
                        result = Math.max(tastiness, result);
                    }
                }
            }
            System.out.println(result);
        }
    }
}
