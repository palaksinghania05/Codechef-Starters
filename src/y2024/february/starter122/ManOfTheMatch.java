package y2024.february.starter122;

import java.util.Scanner;

public class ManOfTheMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int temp = Integer.MIN_VALUE;
            int result = -1;
            for (int i = 0; i < 22; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                b = b * 20;
                int score = a + b;
                if (score >= temp) {
                    temp = score;
                    result = i + 1;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
