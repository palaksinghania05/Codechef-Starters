package y2026.feb.starter224;

import java.util.Scanner;

public class QualifiedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (2 * X <= N && 2 * Y <= N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
