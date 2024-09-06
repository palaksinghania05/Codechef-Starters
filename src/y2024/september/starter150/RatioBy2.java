package y2024.september.starter150;

import java.util.Scanner;

public class RatioBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X >= 2 * Y || Y >= 2 * X)
                System.out.println(0);
            else {
                int tempX = Math.max(0, (2 * Y - X + 1) / 2);
                int tempY = Math.max(0, (2 * X - Y + 1) / 2);
                System.out.println(Math.min(tempX, tempY));
            }
            T--;
        }
    }
}
