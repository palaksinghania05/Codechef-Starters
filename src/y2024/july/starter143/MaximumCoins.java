package y2024.july.starter143;

import java.util.Scanner;

public class MaximumCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int coinsWon = 0;
            int coinsLost = 0;
            for (int i = N - X + 1; i <= N; i++) {
                coinsWon += (1 << i); // 2^i
            }
            for (int i = 1; i <= N - X; i++) {
                coinsLost += (1 << i); // 2^i
            }
            int result = coinsWon - coinsLost;
            System.out.println(result);
            T--;
        }
    }
}
