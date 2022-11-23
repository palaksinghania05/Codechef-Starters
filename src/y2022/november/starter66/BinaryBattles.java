/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-11-2022
 */

package y2022.november.starter66;

import java.util.Scanner;

public class BinaryBattles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int matches = 0;
            while (N>1){
                N/= 2;
                matches++;
            }
         //   System.out.println(matches);
            System.out.println(matches*A + (matches-1)*B);
            T--;
        }
    }
}
