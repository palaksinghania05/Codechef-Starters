package y2026.starter219;

import java.util.Scanner;

public class PizzaComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double x = a / 100.0;
            double y = b / 225.0;
            if (x < y) {
                System.out.println("Small");
            } else if (x > y) {
                System.out.println("Large");
            } else if (x == y) {
                System.out.println("Equal");
            }
        }
    }
}
