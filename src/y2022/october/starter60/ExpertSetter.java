/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-10-2022
 */

package y2022.october.starter60;

import java.util.Scanner;

public class ExpertSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int percent = (Y*100)/X;
            if(percent>=50)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
