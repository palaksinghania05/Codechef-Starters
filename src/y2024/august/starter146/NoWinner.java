package y2024.august.starter146;

import java.util.Scanner;

public class NoWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int M = sc.nextInt();
            if (Math.abs(A - B) <= M || Math.abs(B - C) <= M || Math.abs(A - C) <= M) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
