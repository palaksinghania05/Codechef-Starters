package y2026.jan.starter220;

import java.util.Scanner;

public class TwoPileGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X % 2 == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
