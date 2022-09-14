/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-09-2022
 */

package y2022.september.starter56;

import java.util.Scanner;

public class NearestExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X>50)
                System.out.println("RIGHT");
            else
                System.out.println("LEFT");
            T--;
        }
    }
}
