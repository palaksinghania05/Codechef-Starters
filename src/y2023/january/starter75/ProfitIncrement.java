/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-01-2023
 */

package y2023.january.starter75;

import java.util.Scanner;

public class ProfitIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int newPrice = X + ((10 * X) / 100);
            System.out.println(newPrice - (X - Y));
            T--;
        }
    }
}
