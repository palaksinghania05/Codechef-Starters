/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-12-2022
 */

package y2022.december.starter70;

import java.util.Scanner;

public class SpiceLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X < 4)
                System.out.println("MILD");
            else if (X >= 4 && X < 7)
                System.out.println("MEDIUM");
            else
                System.out.println("HOT");
            T--;
        }
    }
}
