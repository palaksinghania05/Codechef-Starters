package y2024.august.starter147;

import java.util.Scanner;

public class IndependenceDay101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A + B >= C - 1 && B + C >= A - 1 && C + A >= B - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
