/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-02-2023
 */

package y2023.february.starter76;

import java.util.Scanner;

public class ZeroString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int zeroes = 0, ones = 0;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == '0')
                    zeroes++;
                else
                    ones++;
            }
            if (zeroes >= ones)
                System.out.println(ones);
            else
                System.out.println(zeroes + 1);
            T--;
        }
    }
}
