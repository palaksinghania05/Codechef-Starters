package y2025.september.starter202;

import java.util.Scanner;

public class IfOnlyICouldRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }
            boolean flag = false;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    int temp1 = i + 1;
                    int temp2 = i + 2;
                    System.out.println(temp1 + " " + temp2);
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(-1);
        }
    }
}
