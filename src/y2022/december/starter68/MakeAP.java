/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-12-2022
 */

package y2022.december.starter68;

import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int C = sc.nextInt();
            int f = 0;
            for (int i = A; i <= C; i++) {
                if (i - A == C - i) {
                    System.out.println(i);
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                System.out.println(-1);
            T--;
        }
    }
}
