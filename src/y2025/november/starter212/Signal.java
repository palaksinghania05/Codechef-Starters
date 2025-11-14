package y2025.november.starter212;

import java.util.Scanner;

public class Signal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean flag = false;
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    flag = true;
                } else if (flag && S.charAt(i) == '1') {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
