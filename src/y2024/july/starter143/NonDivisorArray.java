package y2024.july.starter143;

import java.util.Scanner;

public class NonDivisorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            A[N] = 1;
            for (int j = N - 1; j > 0; j--) {
                boolean flag = false;
                for (int i = 2 * j; i <= N; i += j) {
                    if (i % j == 0 && A[i] == A[j + 1]) {
                        A[j] = A[j + 1] + 1;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    A[j] = A[j + 1];
                }
            }
            System.out.println(A[1]);
            for (int i = 1; i <= N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
