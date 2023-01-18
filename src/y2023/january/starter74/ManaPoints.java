/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-01-2023
 */

package y2023.january.starter74;

import java.util.Scanner;

public class ManaPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(Y / X);
            T--;
        }
    }
}
