package y2025.may.starter185;

import java.util.Scanner;

public class BalancedLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int temp1 = 0, temp2 = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 2) temp1++;
                if (A[i] == 1) temp2++;
            }
            int temp3 = N - temp1 - temp2;
            if (N % 2 == 1) {
                System.out.println("No");
                continue;
            }
            if (temp1 == temp2 && temp3 == 0) {
                System.out.println("Yes");
            } else {
                if (temp1 > N / 2 || temp2 > N / 2) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}
