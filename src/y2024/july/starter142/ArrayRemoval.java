package y2024.july.starter142;

import java.util.Scanner;

public class ArrayRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int result = N;
            for (int i = 0; i < 32; i++) {
                int temp = (1 << i) - 1;
                int xor = 0;
                int count = 0;
                for (int ele : A) {
                    if (ele > temp)
                        continue;
                    xor |= ele;
                    count++;
                }
                if (xor == temp) {
                    result = Math.min(result, N - count);
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
