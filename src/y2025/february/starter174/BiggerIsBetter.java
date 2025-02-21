package y2025.february.starter174;

import java.util.Scanner;

public class BiggerIsBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) != 'z') {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
                continue;
            } else {
                System.out.println("z".repeat(N));
            }
        }
    }
}
