/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-12-2022
 */

package y2022.december.starter69;

import java.util.Scanner;

public class RainInChefLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X < 3)
                System.out.println("LIGHT");
            else if (X >= 3 && X < 7)
                System.out.println("MODERATE");
            else
                System.out.println("HEAVY");
            T--;
        }
    }
}
