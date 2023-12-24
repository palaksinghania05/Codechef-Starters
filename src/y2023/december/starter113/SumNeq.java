package y2023.december.starter113;

import java.util.Scanner;

public class SumNeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            boolean flag = true;
            int element = A[0];//taking the first element of the array
            for (int i = 1; i < N; i++) {
                if (A[i] != element)
                    flag = false;
            }
            if (flag) {
                System.out.println("NO");
            } else {
                if (N == 4) {
                    if (A[0] + A[1] == A[2] + A[3]) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                } else {
                    System.out.println("YES");
                }
            }
            T--;
        }
    }
}
