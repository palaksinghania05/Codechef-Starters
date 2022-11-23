/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-11-2022
 */

package y2022.november.starter66;

import java.util.Scanner;

public class MonopolyInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();
            if(R1>R2+R3 || R2>R1+R3 || R3>R1+R2)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
