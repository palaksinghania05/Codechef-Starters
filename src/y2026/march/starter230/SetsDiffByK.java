package y2026.march.starter230;

import java.util.Scanner;

public class SetsDiffByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] B = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                B[i] = sc.nextInt();
            }
            boolean ok = true;
            for (int i = 1; i <= N; i++) {
                if (B[i] == 1) {
                    for (int j = i + 1; j <= N; j++) {
                        if (B[j] == 1 && Math.abs(i - j) <= K) {
                            ok = false;
                            break;
                        }
                    }
                }
            }
            for (int i = 1; i <= N && ok; i++) {
                if (B[i] == 0) {
                    boolean found = false;
                    for (int j = Math.max(1, i - K); j <= Math.min(N, i + K); j++) {
                        if (B[j] == 1) {
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        ok = false;
                }
            }
            if (ok)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
