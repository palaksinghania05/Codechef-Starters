/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-11-2022
 */

package y2022.november.starter64;

import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X>=2000)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
