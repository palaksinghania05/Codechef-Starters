package y2024.january.starter115;

import java.util.Scanner;

public class DecoratingChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp = Math.abs(N * 2 - X);
            if (N * 2 <= X) {
                System.out.println("Yes");
            } else if (N <= X && temp * 3 <= Y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
    }
}
