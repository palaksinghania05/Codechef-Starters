package y2026.march.starter228;

import java.util.Scanner;

public class BalloonSmashParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int[] result = new int[N];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                if (temp < A[i]) {
                    result[i] = temp;
                    temp++;
                } else {
                    result[i] = A[i];
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
