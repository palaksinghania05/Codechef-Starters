package y2025.february.starter172;

import java.util.Scanner;

public class SmallPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String result = "1".repeat(Math.max(0, X / 2)) +
                    "2".repeat(Math.max(0, Y / 2)) +
                    "2".repeat(Math.max(0, Y / 2)) +
                    "1".repeat(Math.max(0, X / 2));
            System.out.println(result);
            T--;
        }
    }
}
