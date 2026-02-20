package y2026.feb.starter226;

import java.util.Scanner;

public class IcecreamCones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int N = sc.nextInt();
            int result = X - (Y * N);
            System.out.println(Math.max(0, result));
        }
    }
}
