/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-02-2023
 */

package y2023.february.starter76;

import java.util.Scanner;

public class FourHundredMRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int min = Math.min(X, Math.min(Y, Z));
            if (min == X)
                System.out.println("ALICE");
            else if (min == Y)
                System.out.println("BOB");
            else
                System.out.println("CHARLIE");
            T--;
        }
    }
}
