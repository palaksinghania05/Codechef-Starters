package y2026.march.starter229;

import java.util.Scanner;

public class SequentialClamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int Y = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (Y < A)
                    Y = A;
                if (Y > B)
                    Y = B;
            }
            System.out.println(Y);
        }
    }
}
