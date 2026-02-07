package y2026.feb.starter224;

import java.util.Scanner;

public class TheCodingStreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int result = 0;
            int temp = 0;
            for (int i = 0; i < N; i++) {
                int temp2 = sc.nextInt();
                if (temp2 > 0) {
                    temp++;
                    result = Math.max(result, temp);
                } else {
                    temp = 0;
                }
            }
            System.out.println(result);
        }
    }
}
