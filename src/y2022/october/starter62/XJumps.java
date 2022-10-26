/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-10-2022
 */

package y2022.october.starter62;

import java.util.Scanner;

public class XJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(X/Y + X%Y);
            T--;
        }
    }
}
