package y2025.december.starter217;

import java.util.Scanner;

public class MakeAnAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp = A[1] - A[0];
            for (int i = 2; i < N; i++) {
                temp = gcd(temp, A[i] - A[i - 1]);
            }
            int total = (A[N - 1] - A[0]) / temp + 1;
            System.out.println(total - N);
        }
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
