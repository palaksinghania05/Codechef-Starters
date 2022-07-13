/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-07-2022
 */

package y2022.july.starter47;

import java.util.Scanner;

public class MinimumCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            System.out.println(X%10);
            T--;
        }
    }
}
