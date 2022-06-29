/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-06-2022
 */

package y2022.june.starter45;

import java.util.Scanner;

public class ChangeRowAndColumnBoth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(a!=c && b!=d)
                System.out.println(1);
            else
                System.out.println(2);
            T--;
        }
    }
}
