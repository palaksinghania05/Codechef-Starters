package y2026.march.starter231;

import java.util.Scanner;

public class ImperfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int A = sc.nextInt();
            int N = A;
            int M = A;
            while (true) {
                if ((N % 2 == 0 && N % 5 != 0) || (N % 2 != 0 && N % 5 == 0))
                    break;
                if ((M % 2 == 0 && M % 5 != 0) || (M % 2 != 0 && M % 5 == 0))
                    break;
                N++;
                M--;
            }
            System.out.println(Math.min(Math.abs(N - A), Math.abs(M - A)));
        }
    }
}
