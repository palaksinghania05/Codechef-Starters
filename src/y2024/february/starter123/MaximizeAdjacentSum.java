package y2024.february.starter123;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeAdjacentSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int sum = 0;
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            sum *= 2;
            Arrays.sort(A);
            int result = sum - (A[0] + A[1]);
            System.out.println(result);
            T--;
        }
    }
}
