package y2024.may.starter134;

import java.util.Scanner;

public class MorningRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int area = 2 * (X + Y);
        if (area >= 1000) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
