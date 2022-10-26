/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-10-2022
 */

package y2022.october.starter62;

import java.util.Scanner;

public class MaxMinusMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            System.out.println(Math.max(A, Math.max(B,C)) - Math.min(A, Math.min(B,C)));
            T--;
        }
    }
}
