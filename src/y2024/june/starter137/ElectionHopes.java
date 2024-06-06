package y2024.june.starter137;

import java.util.Scanner;

public class ElectionHopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X >= 2 * Y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
