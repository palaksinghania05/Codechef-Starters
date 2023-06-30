package y2023.june.starter96;

import java.util.Scanner;

public class BellsOfPilgrimage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int P = sc.nextInt();
            if (X >= K && K >= 0) {
                System.out.println(P + (K * 10));
            } else {
                for (int j = 0; j < X; j++) {
                    P = P + 10;
                }
                for (int j = 0; j < K - X; j++) {
                    P = P + 5;
                }
                if (K == N) {
                    P = P + 20;
                }
                System.out.println(P);
                T--;
            }
        }
    }
}
