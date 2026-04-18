package y2026.apr.starter234;

import java.util.Scanner;

public class BinaryConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            StringBuilder S = new StringBuilder();
            if (N == 2) {
                S.append(1);
                S.append(0);
                System.out.println(S);
            } else {
                for (int i = 0; i < N; i++) {
                    if (i == 0 || i == N - 1) {
                        S.append(1);
                    } else {
                        S.append(0);
                    }
                }
                System.out.println(S);
            }
        }
    }
}
