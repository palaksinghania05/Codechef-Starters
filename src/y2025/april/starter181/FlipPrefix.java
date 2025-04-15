package y2025.april.starter181;

import java.util.Scanner;

public class FlipPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int zeroes = 0, ones = 0, temp = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0')
                    zeroes++;
                else
                    ones++;
                if (zeroes == ones)
                    temp++;
            }
            System.out.println(1 << temp);
        }
    }
}
