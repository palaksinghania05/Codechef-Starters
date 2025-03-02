package y2025.february.starter175;

import java.util.Scanner;

public class AlternateIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            int zero = 0, ones = 0;
            if (S.length() <= 1) {
                System.out.println(0);
                continue;
            }
            if (S.charAt(0) == '0')
                zero++;
            else
                ones++;
            boolean flag = true;
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i - 1) == S.charAt(i)) {
                    flag = false;
                }
                if (S.charAt(i) == '0')
                    zero++;
                else
                    ones++;
            }
            if (flag) {
                System.out.println(0);
                continue;
            }
            int temp1 = Math.abs(ones - zero);
            int temp2 = ((S.length() & 1) != 0) ? 1 : 0;
            if (temp2 == temp1) {
                System.out.println(1);
            } else {
                if (temp1 <= temp2 + 2) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
        }
    }
}
