/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-11-2022
 */

package y2022.november.starter64;

import java.util.Scanner;

public class MarioAndBrokenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String s = sc.next();
            String L = s.substring(0,N/2);
            String R = s.substring(N/2 , N);
          //  System.out.println(L + " " + R);
            if(L.equals(R))
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
