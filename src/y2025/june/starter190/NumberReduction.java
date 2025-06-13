package y2025.june.starter190;

import java.util.Scanner;

public class NumberReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            while (true) {
                if (X > 3) {
                    X -= 3;
                } else if (X % 2 == 0) {
                    X /= 2;
                } else {
                    break;
                }
            }
            System.out.println(X);
        }
    }
}
