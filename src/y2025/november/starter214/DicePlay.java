package y2025.november.starter214;

import java.util.Scanner;

public class DicePlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
