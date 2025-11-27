package y2025.november.starter213;

import java.util.Scanner;

public class Separation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder result = new StringBuilder();
        while (T-- > 0) {
            int N = sc.nextInt(), X = sc.nextInt();
            boolean flag1 = false, flag2 = false, flag3 = false;
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                if (A < X)
                    flag1 = true;
                else if (A > X)
                    flag2 = true;
                else
                    flag3 = true;
            }
            result.append((flag1 && flag2 && !flag3) ? "No\n" : "Yes\n");
        }
        System.out.print(result);
    }
}
