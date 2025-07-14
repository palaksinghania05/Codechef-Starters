package y2025.july.starter194;

import java.util.Scanner;

public class ChefBakesCake2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N]; // Required ingredients
            int[] B = new int[N]; //have element
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int result = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] > B[i]) {
                    result += (A[i] - B[i]);
                }
            }
            System.out.println(result);
        }
    }
}
