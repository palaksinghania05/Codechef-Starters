package y2025.march.starter179;

import java.util.Scanner;

public class LostInTheFest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int max = A[N - 1], temp = N - 1;
            for (int i = N - 2; i >= 0; i--) {
                if (A[i] >= max) {
                    temp = i;
                }
            }
            int sum = N - temp - 1;
            System.out.println(sum);
        }
    }
}
