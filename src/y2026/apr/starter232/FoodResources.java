package y2026.apr.starter232;

import java.util.Scanner;

public class FoodResources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int low = 1;
        int high = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] > high) {
                high = A[i];
            }
        }
        int result = 0;
        while (low <= high) {
            int days = (low + high) / 2;
            int available = 0;
            for (int i = 0; i < N; i++) {
                available += A[i] / days;
            }
            if (available >= M) {
                result = days;
                low = days + 1;
            } else {
                high = days - 1;
            }
        }
        System.out.println(result);
    }
}
