package y2025.march.starter177;

import java.util.Scanner;

public class OrderedDistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }
            int[] B = new int[N];
            for (int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }
            boolean result = false;
            for (int i = 0; i < N; i++) {
                boolean flag = true;
                for (int j = 1; j < N; j++) {
                    int x = Math.abs(B[j] - A[i]);
                    int y = Math.abs(B[j - 1] - A[i]);
                    if (!(y < x || (x == y && B[j - 1] <= B[j]))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i + 1);
                    result = true;
                    break;
                }
            }
            if (!result)
                System.out.println("-1");
        }
    }
}
