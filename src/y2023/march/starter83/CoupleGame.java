package y2023.march.starter83;

import java.util.Scanner;

public class CoupleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int G = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(Math.abs(G - B));
            T--;
        }
    }
}
