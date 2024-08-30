package y2024.august.starter149;

import java.util.Scanner;

public class MagicalWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            if (A * B <= X * X) {
                System.out.println(0);
            } else if (A <= X * X || B <= X * X) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
            T--;
        }
    }
}
