/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-09-2022
 */

package y2022.september.starter55;

import java.util.Scanner;

public class BrokenPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X<Y)
                System.out.println("REPAIR");
            else if(Y<X)
                System.out.println("NEW PHONE");
            else
                System.out.println("ANY");
            T--;
        }
    }
}
