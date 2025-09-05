package y2025.september.starter202;

import java.util.Scanner;

public class TwoRolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp1 = 50 - X;
            int temp2 = 2 * Y;
            int result = 2 * (Y + 5);
            if (temp1 >= temp2 && temp1 <= result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
