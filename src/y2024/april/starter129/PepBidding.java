package y2024.april.starter129;

import java.util.Scanner;

public class PepBidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a1 = 0;
            for (int i = 0; i < N; i++) {
                a1 += sc.nextInt();
            }
            int d1 = 0;
            int p1 = 0;
            int d2 = 0;
            for (int i = 0; i < N; i++) {
                d1 += sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                p1 += sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                d2 += sc.nextInt();
            }
            if (a1 > p1 && d1 > d2) {
                System.out.println("A");
            } else if (a1 < p1 && d1 < d2) {
                System.out.println("P");
            } else {
                System.out.println("Draw");
            }
            T--;
        }
    }
}
