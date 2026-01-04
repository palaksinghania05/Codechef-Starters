package y2026.starter219;

import java.util.Scanner;

public class OneAndZeroes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int result = 0, temp = 0;
            ;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    temp++;
                }
                if (temp >= (i + 1) - temp) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
