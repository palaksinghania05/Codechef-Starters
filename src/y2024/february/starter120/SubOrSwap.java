package y2024.february.starter120;

import java.util.Scanner;

public class SubOrSwap {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;

        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(gcd(X, Y));
        }

        sc.close();
    }
}
