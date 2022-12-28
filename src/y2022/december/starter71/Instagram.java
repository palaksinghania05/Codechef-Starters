/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-12-2022
 */

package y2022.december.starter71;

import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > 10 * Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
