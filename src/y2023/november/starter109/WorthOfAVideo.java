package y2023.november.starter109;

import java.util.Scanner;

public class WorthOfAVideo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int S = sc.nextInt();
            System.out.println(24 * S * 1000);
            T--;
        }
    }
}
