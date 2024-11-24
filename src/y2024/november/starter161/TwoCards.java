package y2024.november.starter161;

import java.util.Scanner;

public class TwoCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int temp1 = 0, temp2 = 1;
            A[0] = sc.nextInt();
            A[1] = sc.nextInt();
            if (A[1] > A[0]) {
                temp1 = 1;
                temp2 = 0;
            }
            for (int i = 2; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] > A[temp1]) {
                    temp2 = temp1;
                    temp1 = i;
                } else if (A[i] > A[temp2]) {
                    temp2 = i;
                }
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            boolean result = false;
            for (int i = 0; i < N; i++) {
                int j = temp1;
                if (i == temp1) {
                    j = temp2;
                }
                if (Math.max(A[i], B[i]) >
                        Math.max(A[j], B[j])) {
                    result = true;
                    break;
                }
            }
            System.out.println(result ? "Yes" : "No");
            T--;
        }
    }
}
