/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-07-2022
 */

package y2022.july.starter48;

import java.util.Scanner;

public class FillCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int M = sc.nextInt();
            int capacity = K*M;
            if(N%capacity==0)
                System.out.println(N/capacity);
            else
                System.out.println((N/capacity)+1);
            T--;
        }
    }
}
