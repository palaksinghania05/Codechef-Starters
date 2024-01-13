package y2024.january.starter116;

import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            String S = sc.next();
            int i = 0;
            int temp = 0;
            for (i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    temp--;
                    if (temp < 0) {
                        break;
                    }
                } else {
                    temp = X;
                }
            }
            if (i < N) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
