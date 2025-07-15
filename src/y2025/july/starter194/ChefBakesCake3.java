package y2025.july.starter194;

import java.util.Scanner;

public class ChefBakesCake3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                temp = Math.max(temp, A[i]);
            }
            int result = Integer.MIN_VALUE;
            for (int j = 0; j <= temp; j++) {
                int temp2 = 0;
                for (int i = 0; i < N; i++) {
                    temp2 += 50 * Math.min(j, A[i]);
                }
                int cost = j * N * 30;
                int profit = temp2 - cost;
                result = Math.max(result, profit);
            }
            System.out.println(result);
        }
    }
}
