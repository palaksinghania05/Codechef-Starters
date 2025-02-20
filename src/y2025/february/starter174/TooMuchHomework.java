package y2025.february.starter174;

import java.util.Scanner;

public class TooMuchHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int temp = X + (10 * Y);
        if (temp >= 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
