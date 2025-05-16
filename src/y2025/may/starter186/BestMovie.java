package y2025.may.starter186;

import java.util.Scanner;

public class BestMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int min = Integer.MAX_VALUE;
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
                if (A[i] >= 7) {
                    min = Math.min(min, B[i]);
                    flag = true;
                }
            }
            if (flag)
                System.out.println(min);
            else
                System.out.println("-1");
        }
    }
}
