package y2025.may.starter188;

import java.util.Scanner;

public class RedAndBlueGems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int B = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        System.out.println(Math.max(R * P, B * Q));
    }
}
