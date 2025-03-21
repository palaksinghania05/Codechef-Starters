package y2025.march.starter178;

import java.util.Scanner;

public class Placing01And01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > Y) {
                System.out.println(2 * X - 1);
            } else if (Y > X) {
                System.out.println(2 * Y - 1);
            } else {
                System.out.println(2 * X);
            }
        }
    }
}
