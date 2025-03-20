package y2025.march.starter178;

import java.util.Scanner;

public class FoodBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F1 = sc.nextInt();
        int P1 = sc.nextInt();
        int F2 = sc.nextInt();
        int P2 = sc.nextInt();
        if (Math.abs(F1 - P1) == Math.abs(F2 - P2)) {
            System.out.println("BOTH");
        } else if (Math.abs(F1 - P1) < Math.abs(F2 - P2)) {
            System.out.println("FIRST");
        } else {
            System.out.println("SECOND");
        }
    }
}
