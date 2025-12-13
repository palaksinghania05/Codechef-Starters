package y2025.december.starter216;

import java.util.Scanner;

public class BestSeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int result = 0;
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
                result += A[j];
            }
            for (int j = 0; j < N - 1; j++) {
                int temp = 0;
                temp += A[j] + A[j + 1];
                if (temp < result) {
                    result = temp;
                }
            }
            System.out.println(result);
        }
    }
}
