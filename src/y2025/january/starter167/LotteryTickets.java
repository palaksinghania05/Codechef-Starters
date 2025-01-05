package y2025.january.starter167;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp = A[0], result = 1;
            Arrays.sort(A);
            for (int i = 0; i < N; i++) {
                if (temp == A[i]) {
                    if (i - 1 == -1) {
                        result = result + (A[i] - 1) + (A[i + 1] - A[i]) / 2;
                    } else if (i + 1 == N) {
                        result = result + (1000000 - A[i]) + (A[i] - A[i - 1]) / 2;
                    } else {
                        result = result + (A[i] - A[i - 1]) / 2 + (A[i + 1] - A[i]) / 2;
                    }
                    break;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
