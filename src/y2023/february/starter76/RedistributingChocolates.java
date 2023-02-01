/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-02-2023
 */

package y2023.february.starter76;

import java.util.Scanner;

public class RedistributingChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (X + Y + Z < 6)
                System.out.println("NO");
            else
                System.out.println("YES");
            T--;
        }
    }
}
