package y2024.october.starter155;

import java.util.Scanner;

public class GCDTo1Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] matrix = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i == j)
                        matrix[i][j] = 3;
                    else
                        matrix[i][j] = 2;
                }
            }
            if (N < M) {
                for (int j = N; j < M; j++) {
                    matrix[N - 1][j] = 3;
                }
            }
            if (M < N) {
                for (int i = M; i < N; i++) {
                    matrix[i][0] = 3;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            T--;
        }
    }
}
