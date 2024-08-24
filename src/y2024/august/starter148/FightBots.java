package y2024.august.starter148;

import java.util.Scanner;

public class FightBots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String S = sc.next();
            int temp1 = 0, temp2 = 0;
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'U') {
                    temp2++;
                } else if (S.charAt(i) == 'D') {
                    temp2--;
                } else if (S.charAt(i) == 'R') {
                    temp1++;
                } else {
                    temp1--;
                }
                int temp3 = Math.abs(temp1 - X) + Math.abs(temp2 - Y);
                if (temp3 == (i + 1)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
