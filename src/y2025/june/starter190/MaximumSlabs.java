package y2025.june.starter190;

import java.util.Scanner;

public class MaximumSlabs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = 25 - X;
        if (N % 4 == 0) {
            System.out.println(N / 4);
        } else {
            System.out.println((N / 4) + 1);
        }
    }
}
