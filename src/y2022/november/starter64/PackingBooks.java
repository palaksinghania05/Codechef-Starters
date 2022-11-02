/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-11-2022
 */

package y2022.november.starter64;

import java.util.Scanner;

public class PackingBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if(Y%Z==0){
                System.out.println(X * (Y/Z));
            } else {
                System.out.println(X * ((Y/Z)+1));
            }
            T--;
        }
    }
}
