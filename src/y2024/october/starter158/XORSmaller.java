package y2024.october.starter158;

import java.util.Scanner;

public class XORSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp = A[0];
            for (int x : A) {
                temp &= x;
            }
            long result = 0;
            for (long i = 1; i <= (1L << 30); i *= 2) {
                if ((temp & i) != 0) {
                    result += i;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
