/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

package y2022.june.starter43;

import java.util.Scanner;

public class JoiningDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if((N%5!=0 && K%5==0) || (N%5==0 && K%5!=0))
                System.out.println(N/5 - K/5 - 1);
            else
                System.out.println(N/5 - K/5);
            T--;
        }
    }
}
