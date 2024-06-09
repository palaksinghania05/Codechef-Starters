package y2024.june.starter137;

import java.util.Scanner;

public class DoubleTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] X = new int[N];
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            int lStart = 0, lEnd = N - 1, rStart = N - 1, rEnd = 0;
            for (int i = 0; i < N - 1; i++) {
                if (X[i] + P[i] >= X[i + 1]) {
                    lStart = i + 1;
                } else
                    break;
            }
            for (int i = N - 1; i > 0; i--) {
                if (X[i] - P[i] <= X[i - 1]) {
                    rStart = i - 1;
                } else
                    break;
            }
            for (int i = N - 1; i > 0; i--) {
                if (X[i - 1] + P[i - 1] >= X[i]) {
                    lEnd = i - 1;
                } else
                    break;
            }
            for (int i = 0; i < N - 1; i++) {
                if (X[i + 1] - P[i + 1] <= X[i]) {
                    rEnd = i + 1;
                } else
                    break;
            }
            int temp1 = Math.max(lStart, rEnd) + 1;
            int temp2 = Math.min(rStart, lEnd);
            if (temp1 >= temp2) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            T--;
        }
    }
}
