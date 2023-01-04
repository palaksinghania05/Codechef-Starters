/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-01-2023
 */

package y2023.january.starter72;

import java.util.Scanner;

public class SumIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A + B == C)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
