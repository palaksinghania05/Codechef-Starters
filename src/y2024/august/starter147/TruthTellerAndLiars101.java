package y2024.august.starter147;

import java.util.Scanner;

public class TruthTellerAndLiars101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N <= M) {
                System.out.println("-1");
            } else {
                int X = 2 * M + 1;
                System.out.println(X);
            }
            T--;
        }
    }
}
