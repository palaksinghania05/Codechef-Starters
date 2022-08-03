/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-08-2022
 */

package y2022.august.starter50;

import java.util.Scanner;

public class NearestCourt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int a = (Math.abs(X)+Math.abs(Y))/2;
            System.out.println(Math.max(Math.abs(a-X), Math.abs(a-Y)));
            T--;
        }
    }
}
