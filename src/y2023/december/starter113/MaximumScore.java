package y2023.december.starter113;

import java.util.Scanner;

public class MaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp1 = 0;
            int temp2 = 0;
            for (int value : A) {
                if (value == 0) {
                    temp1++;
                } else if (value == 1) {
                    temp2++;
                }
            }
            int result = Math.min(temp1, temp2);
            System.out.println(result);
            T--;
        }
    }
}
