package y2025.may.starter187;

import java.util.Scanner;

public class IncrementalGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            if ((Math.max(N - K, M) <= K) || (Math.max(M - K, N) <= K))
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }
    }
}
