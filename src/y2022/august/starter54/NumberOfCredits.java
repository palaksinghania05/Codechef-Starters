/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-08-2022
 */

package y2022.august.starter54;

import java.util.Scanner;

public class NumberOfCredits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            System.out.println(X*4+Y*2);
            T--;
        }
    }
}
