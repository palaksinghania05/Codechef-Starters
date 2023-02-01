/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-02-2023
 */

package y2023.february.starter76;

import java.util.Scanner;

public class ReadPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X * Y >= N)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
