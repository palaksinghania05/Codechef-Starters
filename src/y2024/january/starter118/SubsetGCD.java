package y2024.january.starter118;

import java.util.Scanner;

public class SubsetGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int n = N / K;
            for (int i = 1; i <= K; i++) {
                System.out.print(n * i + " ");
            }
            System.out.println();
            T--;
        }
    }
}
