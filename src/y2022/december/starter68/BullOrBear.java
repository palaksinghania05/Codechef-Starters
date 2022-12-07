/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-12-2022
 */

package y2022.december.starter68;

import java.util.Scanner;

public class BullOrBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > Y)
                System.out.println("LOSS");
            else if (Y > X)
                System.out.println("PROFIT");
            else
                System.out.println("NEUTRAL");
            T--;
        }
    }
}
