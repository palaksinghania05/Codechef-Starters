package y2024.september.starter150;

import java.util.Arrays;
import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N + 1];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 0)
                    temp++;
                B[A[i]]++;
            }
            B[0] = 0;
            Arrays.sort(B);
            B[N] = temp + B[N];
            int result = 0;
            for (int i = 1; i <= N; i++) {
                result = result + (B[i] * (B[i] - 1)) / 2;
            }
            System.out.println(result);
            T--;
        }
    }
}
