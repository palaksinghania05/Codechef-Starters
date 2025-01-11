package y2025.january.starter168;

import java.util.Scanner;

public class MakeOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            int score = 0;
            int total = 0;
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) == '1' || B.charAt(i) == '1') {
                    score++;
                }
                if (A.charAt(i) == '1' && B.charAt(i) == '0' || A.charAt(i) == '0' && B.charAt(i) == '1')
                    total++;
            }
            if (score % 2 == 1 || total > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
