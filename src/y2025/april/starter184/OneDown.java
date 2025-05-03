package y2025.april.starter184;

import java.util.Scanner;

public class OneDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (R.charAt(i) == '1' && S.charAt(i) == '0') {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
                continue;
            }
            int temp1 = 0, temp2 = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1')
                    temp1++;
                if (R.charAt(i) == '1')
                    temp2++;
            }

            if (temp1 < temp2 || ((temp1 - temp2) % 2 != 0)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
