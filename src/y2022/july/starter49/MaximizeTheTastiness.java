/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-07-2022
 */

package y2022.july.starter49;

import java.util.Scanner;

public class MaximizeTheTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            System.out.println(Math.max(A,B) + Math.max(C,D));
            T--;
        }
    }
}
