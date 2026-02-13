package y2026.feb.starter225;

import java.util.Scanner;

public class PaymentScheme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int scheme1 = 100 + 4 * X;
        int scheme2 = 300;
        System.out.println(Math.min(scheme1, scheme2));
        sc.close();
    }
}
