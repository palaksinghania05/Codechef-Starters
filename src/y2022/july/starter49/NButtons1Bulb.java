/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-07-2022
 */

package y2022.july.starter49;

import java.util.Scanner;

public class NButtons1Bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();
            int c = 0;
            for (int i = 0; i < N; i++) {
                if(S.charAt(i)=='0' && R.charAt(i)=='1')
                    c++;
                if(S.charAt(i)=='1' && R.charAt(i)=='0')
                    c++;
            }
            if(c%2==0)
                System.out.println(1);
            else
                System.out.println(0);
            T--;
        }
    }
}
