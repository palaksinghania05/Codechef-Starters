package y2023.march.starter80;

import java.util.Scanner;

public class SingleUseAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if ((H - Y) % X == 0) {
                System.out.println(((H - Y) / X) + 1);
            } else {
                System.out.println(((H - Y) / X) + 2);
            }

            T--;
        }
    }
}
