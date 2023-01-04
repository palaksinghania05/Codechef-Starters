/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-01-2023
 */

package y2023.january.starter72;

import java.util.Scanner;

public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N == 1)
                System.out.println(1);
            else {
                while (N != M) {
                    if (N > M)
                        N -= M;
                    else
                        M -= N;
                }
                System.out.println(N);
            }
            T--;
        }
    }
}
