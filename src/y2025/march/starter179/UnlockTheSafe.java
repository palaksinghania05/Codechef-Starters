package y2025.march.starter179;

import java.util.ArrayList;
import java.util.Scanner;

public class UnlockTheSafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++)
                B[i] = sc.nextInt();
            int moves = 0;
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int temp1 = Math.min(Math.abs(A[i] - B[i]), 9 - Math.abs(A[i] - B[i]));
                int temp2 = Math.max(Math.abs(A[i] - B[i]), 9 - Math.abs(A[i] - B[i]));
                moves += temp1;
                if (temp1 != temp2)
                    temp.add(temp2 - temp1);
            }
            int remaining = K - moves;
            int min = Integer.MAX_VALUE;
            for (int i : temp)
                min = Math.min(min, i);
            if (remaining < 0)
                System.out.println("No");
            else if (remaining % 2 == 0 || min <= remaining)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
