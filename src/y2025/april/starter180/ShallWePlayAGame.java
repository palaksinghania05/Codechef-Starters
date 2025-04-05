package y2025.april.starter180;

import java.util.Scanner;

public class ShallWePlayAGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int mod = 998244353;
        while (T-- > 0) {
            int N = sc.nextInt();
            int score = 1;
            int temp = 1;
            for (int i = 1; i < N; i++) {
                temp = ((temp % mod) * (2 % mod)) % mod;
                if (i % 2 == 1) {
                    score = ((score % mod) + (temp % mod)) % mod;
                } else {
                    score = temp;
                }
            }
            System.out.println(score);
        }
    }
}
