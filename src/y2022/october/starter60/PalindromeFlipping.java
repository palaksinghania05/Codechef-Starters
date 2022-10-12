/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-10-2022
 */

package y2022.october.starter60;

import java.util.Scanner;

public class PalindromeFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String s = sc.next();
            int ones = 0;
            int zeroes = 0;
            for (int i = 0; i < N; i++) {
                if(s.charAt(i)=='0')
                    zeroes++;
                else
                    ones++;
            }
            if(zeroes%2==0 || ones%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
