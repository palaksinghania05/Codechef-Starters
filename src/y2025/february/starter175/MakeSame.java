package y2025.february.starter175;

import java.util.Scanner;

public class MakeSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S1 = sc.next();
            String S2 = sc.next();
            String S3 = sc.next();
            int x1 = 0, x2 = 0, x3 = 0;
            int y1 = 0, y2 = 0, y3 = 0;
            for (int i = 0; i < N; i++) {
                if (S1.charAt(i) == '1')
                    x1++;
                else
                    y1++;
            }
            for (int i = 0; i < N; i++) {
                if (S2.charAt(i) == '1')
                    x2++;
                else
                    y2++;
            }
            for (int i = 0; i < N; i++) {
                if (S3.charAt(i) == '1')
                    x3++;
                else
                    y3++;
            }
            if ((x1 + x2 + x3) % N != 0) {
                System.out.println("-1");
            } else {
                System.out.println(Math.min(Math.min(x2, y2), Math.min(x3, y3)) + Math.min(Math.min(x1, y1), Math.max(Math.min(x2, y2), Math.min(x3, y3))));
            }
        }
    }
}
