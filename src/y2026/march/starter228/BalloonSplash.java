package y2026.march.starter228;

import java.util.Scanner;

public class BalloonSplash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.println("Alice");
        } else if (B > A) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
