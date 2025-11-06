package y2025.november.starter211;

import java.util.Scanner;

public class FuelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if ((X * Y) >= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
