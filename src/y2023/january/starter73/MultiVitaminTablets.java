/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-01-2023
 */

package y2023.january.starter73;

import java.util.Scanner;

public class MultiVitaminTablets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (3 * X <= Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
