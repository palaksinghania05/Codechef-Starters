package y2024.may.starter134;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int count = 0;
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) == S.charAt(i - 1)) {
                    count++;
                    i++;
                }
            }
            System.out.println(N - count);
            T--;
        }
    }
}
