package y2025.june.starter191;

import java.util.Scanner;

public class AddToGetGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (gcd(A, B) > 1) {
                System.out.println(0);
            } else if (gcd(A + 1, B) > 1 || gcd(A, B + 1) > 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
