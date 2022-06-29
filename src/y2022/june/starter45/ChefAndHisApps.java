/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-06-2022
 */

package y2022.june.starter45;

import java.util.Scanner;

public class ChefAndHisApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int S = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int remaining = S-(X+Y);
            if(remaining>=Z)
                System.out.println(0);
            else{
                if(remaining+X>=Z || remaining+Y>=Z)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            T--;
        }
    }
}
