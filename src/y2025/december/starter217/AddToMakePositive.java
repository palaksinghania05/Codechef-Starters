package y2025.december.starter217;

import java.util.Scanner;

public class AddToMakePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += sc.nextLong();
            }
            if (sum >= 0) {
                System.out.println(0);
            } else {
                long result = (-sum + N - 1) / N;
                System.out.println(result);
            }
        }
    }
}
