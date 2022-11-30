/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-11-2022
 */

package y2022.november.starter67;

import java.util.Scanner;

public class MinimumNumberOfOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(N / 2);
            T--;
        }
    }
}
