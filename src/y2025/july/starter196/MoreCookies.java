package y2025.july.starter196;

import java.util.Arrays;
import java.util.Scanner;

public class MoreCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            int temp = C;
            if (temp <= A[0]) {
                temp = A[0] + 1;
            }
            for (int i = 1; i < N; i++) {
                if (A[i] == temp) {
                    temp++;
                } else if (A[i] > temp) {
                    break;
                }
            }
            System.out.println(temp - C);
        }
    }
}
