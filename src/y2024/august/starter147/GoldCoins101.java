package y2024.august.starter147;

import java.util.Scanner;

public class GoldCoins101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X > Y) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}
