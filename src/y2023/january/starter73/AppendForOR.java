/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-01-2023
 */

package y2023.january.starter73;

import java.util.Scanner;

public class AppendForOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int Y = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int or = 0;
            for (int i = 0; i < N; i++) {
                or = or | arr[i];
            }
            int X = Y - or;
            if ((X & Y) == X)
                System.out.println(X);
            else
                System.out.println(-1);
            T--;
        }
    }
}
