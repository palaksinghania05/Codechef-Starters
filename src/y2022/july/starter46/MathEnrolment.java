/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-07-2022
 */

package y2022.july.starter46;

import java.util.Scanner;

public class MathEnrolment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y<=X)
                System.out.println(0);
            else
                System.out.println(Y-X);
            T--;
        }
    }
}
