package y2024.november.starter159;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= N; i++) {
                if ((i + X) % 2 == 0 && i != X) {
                    result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
