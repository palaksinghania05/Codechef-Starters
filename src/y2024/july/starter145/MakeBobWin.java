package y2024.july.starter145;

import java.util.Scanner;

public class MakeBobWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            if (N == 1) {
                if (S.charAt(0) == '1')
                    System.out.println(0);
                else
                    System.out.println(1);
            } else {
                int result = 0;
                if (S.charAt(0) == '0')
                    result++;
                if (S.charAt(S.length() - 1) == '0')
                    result++;
                System.out.println(result);
            }
            T--;
        }
    }
}
