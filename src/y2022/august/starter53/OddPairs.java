/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-08-2022
 */

package y2022.august.starter53;

import java.util.Scanner;

public class OddPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            long N = sc.nextLong();
//            int pairs = 0;
//            for (int i = 1; i <= N; i++) {
//                for (int j = 1; j <= N; j++) {
//                    if ((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0))
//                        pairs++;
//                }
//            }
//            System.out.println(pairs);
            System.out.println(N*N/2);
            T--;
        }
    }
}
