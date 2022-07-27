/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-07-2022
 */

package y2022.july.starter49;

import java.util.Scanner;

public class IsItHotOrCold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            if(N>20)
                System.out.println("HOT");
            else
                System.out.println("COLD");
            T--;
        }
    }
}
