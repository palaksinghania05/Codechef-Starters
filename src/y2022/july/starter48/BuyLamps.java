/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-07-2022
 */

package y2022.july.starter48;

import java.util.Scanner;

public class BuyLamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int min = Math.min(X,Y);
            int money = K*X + (N-K)*min;
            System.out.println(money);
            T--;
        }
    }
}
