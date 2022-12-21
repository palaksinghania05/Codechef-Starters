/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-12-2022
 */

package y2022.december.starter70;

import java.util.Scanner;

public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int cost = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= X)
                    cost += B[i];
            }
            System.out.println(cost);
            T--;
        }
    }
}
