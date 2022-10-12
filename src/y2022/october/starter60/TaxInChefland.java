/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-10-2022
 */

package y2022.october.starter60;

import java.util.Scanner;

public class TaxInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X>100)
                System.out.println(X-10);
            else
                System.out.println(X);
            T--;
        }
    }
}
