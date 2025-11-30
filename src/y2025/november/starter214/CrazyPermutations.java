package y2025.november.starter214;

import java.util.Scanner;

public class CrazyPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            boolean flag = false;
            for (int i = 0; i < N - 1; i++) {
                if ((A[i] < A[i + 1] && B[i] < B[i + 1]) || (A[i] > A[i + 1] && B[i] > B[i + 1]))
                    continue;
                flag = true;
                break;
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
