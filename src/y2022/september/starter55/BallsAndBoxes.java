/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-09-2022
 */

package y2022.september.starter55;

import java.util.Scanner;

public class BallsAndBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int res = K*(K+1)/2;
            if(N>=res)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
