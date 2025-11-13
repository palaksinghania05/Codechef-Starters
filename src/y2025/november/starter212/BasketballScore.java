package y2025.november.starter212;

import java.util.Scanner;

public class BasketballScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int result = X * 3 + Y * 2;
        System.out.println(result);
    }
}
