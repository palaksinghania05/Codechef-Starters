package y2023.march.starter80;

import java.util.Scanner;

public class RunningComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] alice = new int[N];
            int[] bob = new int[N];
            for (int i = 0; i < N; i++) {
                alice[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                bob[i] = sc.nextInt();
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (bob[i] <= 2 * alice[i] && alice[i] <= 2 * bob[i])
                    result++;
            }
            System.out.println(result);
            T--;
        }
    }
}
