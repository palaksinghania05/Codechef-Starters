/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-08-2022
 */

package y2022.august.starter53;

import java.util.Scanner;

public class CarTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X<=300)
                System.out.println(3000);
            else
                System.out.println(X*10);
            T--;
        }
    }
}
