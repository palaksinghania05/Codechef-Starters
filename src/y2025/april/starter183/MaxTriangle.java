package y2025.april.starter183;

import java.util.Scanner;

public class MaxTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N >= 4) {
                System.out.println(3 * N - 3);
            } else {
                System.out.println(-1);
            }
        }
    }
}
