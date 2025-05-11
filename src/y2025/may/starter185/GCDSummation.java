package y2025.may.starter185;

import java.util.Scanner;

public class GCDSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            if (K < N - 1) {
                System.out.println("-1");
            } else {
                long temp = (K - (N - 2));
                System.out.print(temp * 2 + " ");
                System.out.print(temp + " ");
                for (int i = 0; i < (N - 2); i++) {
                    System.out.print((temp * 2) + (i + 1) + " ");
                }
                System.out.println();
            }
        }
    }
}
