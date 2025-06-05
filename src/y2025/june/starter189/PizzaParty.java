package y2025.june.starter189;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((4 * A + 3 * B) / 8 + 1);
    }
}
