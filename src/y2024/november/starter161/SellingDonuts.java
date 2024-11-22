package y2024.november.starter161;

import java.util.Scanner;

public class SellingDonuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
            }
            int sadCustomers = 0;
            for (int i = 0; i < M; i++) {
                int donutType = B[i] - 1;
                if (donutType >= 0 && donutType < N && A[donutType] > 0) {
                    A[donutType]--;
                } else {
                    sadCustomers++;
                }
            }
            System.out.println(sadCustomers);
            T--;
        }
        sc.close();
    }
}
