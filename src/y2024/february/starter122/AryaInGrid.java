package y2024.february.starter122;

import java.util.Scanner;

public class AryaInGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextInt();
            long M = sc.nextInt();
            long X0 = sc.nextInt();
            long Y0 = sc.nextInt();
            long L = sc.nextInt();
            long up = (X0 - 1) / L;
            long bottom = (N - X0) / L;
            long left = (Y0 - 1) / L;
            long right = (M - Y0) / L;
            long result = (up + bottom) * (right + left);
            if (L == 1)
                System.out.println(N * M);
            else {
                System.out.println(result + right + left + up + bottom + 1);
            }
            T--;
        }
    }
}
