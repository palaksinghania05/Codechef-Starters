package y2023.december.starter114;

import java.util.Scanner;

public class ChristmasCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp[] = new int[N];
            int result = 0;
            int max = 0;
            for (int a = 0; a < N; a++) {
                max = Math.max(max, A[a]);
                temp[a] = max;
            }
            for (int a = 0; a < N; a++) {
                if (A[a] < temp[a]) {
                    result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
