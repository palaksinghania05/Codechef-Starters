/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-07-2022
 */

package y2022.july.starter48;

import java.util.Scanner;

public class PassesForFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(K<(N+1))
                System.out.println("NO");
            else
                System.out.println("YES");
            T--;
        }
    }
}
