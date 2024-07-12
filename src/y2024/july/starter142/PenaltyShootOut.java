package y2024.july.starter142;

import java.util.Scanner;

public class PenaltyShootOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X == Y) {
                System.out.println("Yes");
            } else if (Y > X) {
                if ((Y - X) <= 2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if ((X - Y) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            T--;
        }
    }
}
