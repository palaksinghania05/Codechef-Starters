package y2024.october.starter156;

import java.util.Scanner;

public class SweetsShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int cost = 20;
        int remainingMoney = X - (N * 10);
        System.out.println(remainingMoney / cost);
    }
}
