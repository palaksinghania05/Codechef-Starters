package y2025.april.starter184;

import java.util.Scanner;

public class SumTo0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N == 1) {
                System.out.println("-1");
            } else if (N % 2 == 0) {
                for (int i = 0; i < N / 2; i++) {
                    System.out.print("3 -3 ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < (N - 3) / 2; i++) {
                    System.out.print("3 -3 ");
                }
                System.out.println("1 2 -3");
            }
        }
    }
}
