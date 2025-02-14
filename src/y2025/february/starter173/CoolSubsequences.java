package y2025.february.starter173;

import java.util.Arrays;
import java.util.Scanner;

public class CoolSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            int temp = 0;
            for (int j = 1; j < N; j++) {
                if (A[j - 1] == A[j]) {
                    System.out.println(1);
                    System.out.println(A[j]);
                    temp++;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println(-1);
            }
            T--;
        }
    }
}
