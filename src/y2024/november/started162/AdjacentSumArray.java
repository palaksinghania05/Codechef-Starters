package y2024.november.started162;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacentSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt(); // Size of array A
            int[] A = new int[N - 1]; // Shuffled array B
            for (int i = 0; i < N - 1; i++) {
                A[i] = sc.nextInt(); // Input elements of B
            }
            Arrays.sort(A); // Sort B for consistent order
            int[] arr = new int[N];
            arr[0] = A[0] / 2;
            arr[1] = A[0] - arr[0];
            for (int i = 2; i < N; i++) {
                arr[i] = A[i - 1] - arr[i - 1];
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
