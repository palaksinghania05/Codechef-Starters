package y2026.feb.starter224;

import java.util.Scanner;

public class Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long b = sc.nextInt();
            long g = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();
            long n = sc.nextInt();
            if (x + y > n || b < x || g < y)
                System.out.println(-1);
            else {
                long totalStud = b + g;
                long upper = (totalStud + n - 1) / n;
                if (upper * x <= b && upper * y <= g)
                    System.out.println(upper);
                else
                    System.out.println(-1);
            }
        }
        sc.close();
    }
}
