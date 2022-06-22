/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-06-2022
 */

package y2022.june.starter44;

import java.util.Scanner;

public class Jogging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            long N = sc.nextLong();
            int X = sc.nextInt();
            long result = X;
            long previous = result;
            for (int i = 2; i <= N; i++) {
                result = result + previous;
                previous = result;
                result = result%1000000007;
            }
            System.out.println(result);
            T--;
        }
    }
}
