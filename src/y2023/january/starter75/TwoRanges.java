/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-01-2023
 */

package y2023.january.starter75;

import java.util.HashSet;
import java.util.Scanner;

public class TwoRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            HashSet<Integer> result = new HashSet<>();
            for (int i = A; i <= B; i++) {
                result.add(i);
            }
            for (int i = C; i <= D; i++) {
                result.add(i);
            }
            System.out.println(result.size());
            T--;
        }
    }
}
