/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-01-2023
 */

package y2023.january.starter72;

import java.util.Scanner;

public class Indivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int K = 2;
            while (K < 100) {
                if (A % K != 0 && B % K != 0 && C % K != 0)
                    break;
                else
                    K++;
            }
            System.out.println(K);
            T--;
        }
    }
}
