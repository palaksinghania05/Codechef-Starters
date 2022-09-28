/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-09-2022
 */

package y2022.september.starter58;

import java.util.Scanner;

public class BreakTheElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int even = 0;
            for (int i = 0; i < N; i++) {
                if(A[i]%2==0)
                    even++;
            }
            if(even==N || even == 0)
                System.out.println(0);
            else
                System.out.println(even);
            T--;
        }
    }
}
