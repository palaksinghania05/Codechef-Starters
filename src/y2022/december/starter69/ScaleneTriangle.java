/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-12-2022
 */

package y2022.december.starter69;

import java.util.Scanner;

public class ScaleneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A != B && B != C && A != C)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
