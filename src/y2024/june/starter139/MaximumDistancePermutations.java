package y2024.june.starter139;

import java.util.Scanner;

public class MaximumDistancePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            for (int i = 1; i <= X; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < X; i++) {
                System.out.print((X / 2 + i) % X + 1 + " ");
            }
            System.out.println();
            T--;
        }
    }
}
