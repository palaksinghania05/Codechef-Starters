package y2024.june.starter139;

import java.util.Scanner;

public class DistributeCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = M % N;
            if (X == 0)
                System.out.println(0);
            else if (X < (N / 2 + 1)) {
                if (N < M)
                    System.out.println(X);
                else
                    System.out.println(N - X);
            } else {
                System.out.println(N - X);
            }
            T--;
        }
    }
}
