package y2026.feb.starter227;

import java.util.Scanner;

public class BankGlitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= A) {
                System.out.println(A / x * y + B + A % x);
            } else {
                System.out.println(A + B);
            }
        }
    }
}
