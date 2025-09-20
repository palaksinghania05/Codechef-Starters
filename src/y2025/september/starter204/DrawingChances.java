package y2025.september.starter204;

import java.util.Scanner;

public class DrawingChances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String S = sc.next();
            int temp1 = 0;
            for (char c : S.toCharArray()) {
                if (c == '1')
                    temp1++;
            }
            int temp2 = M - temp1;
            int temp3 = N - M;
            int temp4 = temp2 - temp1 + temp3;
            if (temp4 % 2 == 0) {
                int ele = temp4 / 2;
                if (ele >= 0 && ele <= temp3) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
