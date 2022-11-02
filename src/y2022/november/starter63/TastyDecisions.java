/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-11-2022
 */

package y2022.november.starter63;

import java.util.Scanner;

public class TastyDecisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X*2>Y*5)
                System.out.println("Chocolate");
            else if(X*2<Y*5)
                System.out.println("Candy");
            else
                System.out.println("Either");
            T--;
        }
    }
}
