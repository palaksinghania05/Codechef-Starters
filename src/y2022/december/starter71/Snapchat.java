/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-12-2022
 */

package y2022.december.starter71;

import java.util.Scanner;

public class Snapchat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int streak = 0;
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] != 0 && B[i] != 0)
                    streak++;
                else {
                    result = Math.max(result, streak);
                    streak = 0;
                }
            }
            System.out.println(Math.max(result, streak));
            T--;
        }
    }
}
