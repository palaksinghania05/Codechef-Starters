/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-10-2022
 */

package y2022.october.starter61;

import java.util.Scanner;

public class OddSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if((A+B)%2!=0 || (B+C)%2!=0 || (A+C)%2!=0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
