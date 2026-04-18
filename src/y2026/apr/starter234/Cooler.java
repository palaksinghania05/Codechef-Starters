package y2026.apr.starter234;

import java.util.Scanner;

public class Cooler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int totalMinutes = (N * (N + 1) / 2) - (M * (M + 1) / 2);
            System.out.println(totalMinutes);
        }
        sc.close();
    }
}
