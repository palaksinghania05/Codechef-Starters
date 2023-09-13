package y2023.september.starter100;

import java.util.Scanner;

public class TradeSurplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int res = (A1 - A2) + (B1 - B2);
            if (res >= 0)
                System.out.println("No");
            else
                System.out.println("Yes");
            T--;
        }
    }
}
