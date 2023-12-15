package y2023.december.starter112;

import java.util.Scanner;

public class FairShareSettlement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int K = sc.nextInt() + 1;
            int N = A / K;
            A = A - N * (K - 1);
            System.out.println(A);
            T--;
        }
    }
}
