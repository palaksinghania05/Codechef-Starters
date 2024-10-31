package y2024.october.starter158;

import java.util.Scanner;

public class DiwaliDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X >= Y) {
            System.out.println(X - Y);
        } else {
            System.out.println(0);
        }
    }
}
