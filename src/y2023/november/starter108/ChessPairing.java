package y2023.november.starter108;

import java.util.Scanner;

public class ChessPairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int total = sc.nextInt();
            int rated = sc.nextInt();
            if (rated <= 1) {
                System.out.println("0");
            } else {
                int y = total * 2 - rated;
                if ((rated - y) > 0)
                    System.out.println(rated - y);
                else {
                    System.out.println("0");
                }
            }
            T--;
        }
    }
}
