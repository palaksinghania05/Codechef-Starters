package y2025.september.starter202;

import java.util.Scanner;

public class BuyingFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int result = Integer.MAX_VALUE;
            for (int b = 0; b <= N / 3; b++) {
                int remaining = N - 3 * b;
                if (remaining % 2 == 0) {
                    int a = remaining / 2;
                    int cost = 4 * a + 5 * b;
                    result = Math.min(result, cost);
                }
            }
            System.out.println(result);
        }
    }
}
