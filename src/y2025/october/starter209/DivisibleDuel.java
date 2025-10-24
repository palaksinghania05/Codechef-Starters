package y2025.october.starter209;

import java.util.Scanner;

public class DivisibleDuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int sumEven = 0;
            int sumOdd = 0;
            for (int i = X; i <= Y; i++) {
                if (i % X == 0) {
                    if (i % 2 == 0) {
                        sumEven += i;
                    } else {
                        sumOdd += i;
                    }
                }
            }
            if (sumEven >= sumOdd)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
