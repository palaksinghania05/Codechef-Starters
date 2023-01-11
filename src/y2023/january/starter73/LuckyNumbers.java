/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-01-2023
 */

package y2023.january.starter73;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int f = 0;
            int X = sc.nextInt();
            while (X != 0) {
                int rem = X % 10;
                if (rem == 7) {
                    f = 1;
                    break;
                }
                X = X / 10;
            }
            if (f == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
            T--;
        }
    }
}
