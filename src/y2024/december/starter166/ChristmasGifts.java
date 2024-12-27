package y2024.december.starter166;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int H = sc.nextInt();
            int L = sc.nextInt();
            int W = sc.nextInt();
            int temp = 2 * ((H * L) + (L * W) + (H * W));
            System.out.println(1000 / temp);
            T--;
        }
    }
}
