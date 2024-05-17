package y2024.may.starter134;

import java.util.Scanner;

public class MoneyDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for (int i = 1; i <= Y; i++) {
                int temp1 = X + 1000;
                int temp2 = X * 2;
                X = Math.max(temp1, temp2);
            }
            System.out.println(X);
            T--;
        }
    }
}
