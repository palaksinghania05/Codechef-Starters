package y2025.august.starter199;

import java.util.Scanner;

public class BrickComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp = A[0];
            int result = 1;
            for (int i = 1; i < N; i++) {
                if (A[i] > temp) {
                    temp = A[i];
                    result = i + 1;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
