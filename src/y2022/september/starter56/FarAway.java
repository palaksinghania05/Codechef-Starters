/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-09-2022
 */

package y2022.september.starter56;

import java.util.Scanner;

public class FarAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            long M = sc.nextLong();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            long result= 0;
            for (int i = 0; i < N; i++) {
                result += Math.max(Math.abs(A[i]-M), Math.abs(A[i]-1));
            }
            System.out.println(result);
            T--;
        }
    }
}
