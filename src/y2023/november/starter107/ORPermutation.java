package y2023.november.starter107;

import java.util.Scanner;

public class ORPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            for (int i = X; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            T--;
        }
    }
}
