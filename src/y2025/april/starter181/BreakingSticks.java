package y2025.april.starter181;

import java.util.Scanner;

public class BreakingSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                int length = sc.nextInt();
                if (length > 1) {
                    result += (length - 1);
                }
            }
            System.out.println(result);
        }
    }
}
