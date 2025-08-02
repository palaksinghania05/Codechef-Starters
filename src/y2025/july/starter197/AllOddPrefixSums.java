package y2025.july.starter197;

import java.util.Scanner;

public class AllOddPrefixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int odd = 0;
            int even = 0;
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] % 2 != 0) {
                    odd++;
                } else {
                    even++;
                }
            }
            if (odd == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
