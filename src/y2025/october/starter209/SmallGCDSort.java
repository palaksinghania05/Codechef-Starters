package y2025.october.starter209;

import java.util.Arrays;
import java.util.Scanner;

public class SmallGCDSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] A = new int[N][2];

            for (int i = 0; i < N; i++) {
                int player = i + 1;
                A[i][0] = player;
                A[i][1] = gcd(player, N);
            }

            Arrays.sort(A, (a1, a2) -> {
                if (a1[1] != a2[1])
                    return a2[1] - a1[1];
                else
                    return a1[0] - a2[0];
            });

            for (int i = 0; i < N; i++) {
                System.out.print(A[i][0] + " ");
            }
            System.out.println();
        }
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
