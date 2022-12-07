/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-12-2022
 */

package y2022.december.starter68;

import java.util.Scanner;

public class MakeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int C = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (X - arr[i] > C) {
                    sum = sum + X;
                    count = count + C;
                } else
                    sum += arr[i];
            }
            System.out.println(sum - count);
            T--;
        }
    }
}
