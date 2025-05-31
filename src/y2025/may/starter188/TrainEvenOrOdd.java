package y2025.may.starter188;

import java.util.Scanner;

public class TrainEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int oddSum = 0;
            int evenSum = 0;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    oddSum += A[i];
                } else {
                    evenSum += A[i];
                }
            }
            System.out.println(Math.max(oddSum, evenSum));
        }
    }
}
