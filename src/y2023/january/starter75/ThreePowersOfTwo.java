/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-01-2023
 */

package y2023.january.starter75;

import java.util.Scanner;

public class ThreePowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == '1')
                    sum++;
            }
            if (s.equals("1") || s.equals("10"))
                System.out.println("NO");
            else if (sum <= 3) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            T--;
        }
    }
}
