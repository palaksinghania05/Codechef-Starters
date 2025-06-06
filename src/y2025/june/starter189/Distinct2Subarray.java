package y2025.june.starter189;

import java.util.Scanner;

public class Distinct2Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int minLength = Integer.MAX_VALUE;
            boolean found = false;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] != A[i + 1]) {
                    minLength = 2;
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(minLength);
            } else {
                System.out.println(-1);
            }
        }
    }
}
