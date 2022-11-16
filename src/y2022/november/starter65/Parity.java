/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-11-2022
 */

package y2022.november.starter65;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            if(N%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
