package y2025.february.starter175;

import java.util.Scanner;

public class TechnexTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N == 1) {
                System.out.println(N);
                continue;
            }
            if (N % 2 == 0) {
                int result = N / 2 + 1;
                System.out.println(result);
            } else {
                int result = N / 2;
                System.out.println(result);
            }
        }
    }
}
