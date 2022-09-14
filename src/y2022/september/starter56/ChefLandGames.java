/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-09-2022
 */

package y2022.september.starter56;

import java.util.Scanner;

public class ChefLandGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();
            int R4 = sc.nextInt();
            if(R1==0 && R2==0 && R3==0 && R4==0)
                System.out.println("IN");
            else
                System.out.println("OUT");
            T--;
        }
    }
}
