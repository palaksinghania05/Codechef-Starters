/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-07-2022
 */

package y2022.july.starter46;

import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(N*M);
            T--;
        }
    }
}
