package y2025.may.starter188;

import java.util.Scanner;

public class SubsetSum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[3];
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                A[num % 3]++;
            }
            if (A[0] > 0 || (A[1] > 0 && A[2] > 0) || A[1] >= 3 || A[2] >= 3) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
