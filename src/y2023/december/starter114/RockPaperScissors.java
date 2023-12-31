package y2023.december.starter114;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                result.append('P');
            }
            int count = N / 2 + 1;
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == 'R') {
                    count--;
                }
            }
            for (int i = N - 1; i >= 0; i--) {
                if (count > 0 && (s.charAt(i) == 'P' || s.charAt(i) == 'S')) {
                    result.setCharAt(i, (s.charAt(i) == 'P') ? 'S' : 'R');
                    count--;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
