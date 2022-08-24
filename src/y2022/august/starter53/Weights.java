/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-08-2022
 */

package y2022.august.starter53;

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();;
            if(W==X || W==Y || W==Z)
                System.out.println("YES");
            else if(W==X+Y || W==Y+Z || W==X+Z || W==X+Y+Z)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
