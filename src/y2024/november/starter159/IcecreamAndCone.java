package y2024.november.starter159;

import java.util.Scanner;

public class IcecreamAndCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int result = Math.min(X, Y);
        System.out.println(result);
    }
}
