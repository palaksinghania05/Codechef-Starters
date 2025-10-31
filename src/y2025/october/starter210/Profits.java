package y2025.october.starter210;

import java.util.Scanner;

public class Profits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (N - X <= 0) {
                System.out.println("0");
            } else {
                int temp = N - X;
                int result = 0;
                for (int i = 1; i <= temp; i++) {
                    result += i;
                }
                System.out.println(result);
            }
        }
    }
}
