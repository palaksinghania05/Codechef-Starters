package y2023.march.starter79;

import java.util.Scanner;

public class BetterDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if ((100 - A) < (200 - 2 * B))
                System.out.println("FIRST");
            else if ((100 - A) > (200 - 2 * B))
                System.out.println("SECOND");
            else
                System.out.println("BOTH");
            T--;
        }
    }
}
