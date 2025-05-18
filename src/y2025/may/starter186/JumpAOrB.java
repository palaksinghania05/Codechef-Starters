package y2025.may.starter186;

import java.util.Scanner;

public class JumpAOrB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int diff = M - B * N;
            int stepDifference = A - B;
            if (diff % stepDifference == 0) {
                int temp = diff / stepDifference;
                if (temp >= 0 && temp <= N) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
