/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-06-2022
 */

package y2022.june.starter45;

import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X>Y)
                System.out.println(X);
            else
                System.out.println(Y);
            T--;
        }
    }
}
