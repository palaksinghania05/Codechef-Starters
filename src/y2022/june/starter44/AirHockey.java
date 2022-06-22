/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-06-2022
 */

package y2022.june.starter44;

import java.util.Scanner;

public class AirHockey {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(7-Math.max(A,B));
            T--;
        }
    }
}
