package y2023.july.starter99;

import java.util.Scanner;

public class EndlessAppetizers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int R = sc.nextInt();
            int N = R / 30;
            int C = X + N;
            int D = C / Y;
            if (C % Y == 0) {
                System.out.println(D);
            } else {
                System.out.println(D + 1);
            }
            T--;
        }
    }
}
