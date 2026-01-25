package y2026.jan.starter222;

import java.util.Scanner;

public class SortingPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            int result = 0;
            for (int i = N - 1; i >= 0; i--) {

                if (A[i] != i + 1) {
                    result = A[i];
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
