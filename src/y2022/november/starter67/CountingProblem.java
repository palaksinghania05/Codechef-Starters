/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-11-2022
 */

package y2022.november.starter67;

import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int even = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 != 0)
                    even++;
            }
            if (even == 0 || even % 2 != 0)
                System.out.println("No");
            else
                System.out.println("Yes");
            T--;
        }
    }
}
