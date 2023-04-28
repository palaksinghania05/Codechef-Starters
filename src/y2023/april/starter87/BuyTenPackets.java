package y2023.april.starter87;

import java.util.Scanner;

public class BuyTenPackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if ((2 * X) > Y) {
                System.out.println(2 * Y + X);
            } else {
                System.out.println(5 * X);
            }
            T--;
        }
    }
}
