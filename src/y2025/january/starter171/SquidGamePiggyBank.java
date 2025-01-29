package y2025.january.starter171;

import java.util.Scanner;

public class SquidGamePiggyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(Math.abs(N - K) * 10000);
    }
}
