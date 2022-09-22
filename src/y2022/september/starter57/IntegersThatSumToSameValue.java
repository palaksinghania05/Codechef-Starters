/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-09-2022
 */

package y2022.september.starter57;

import java.util.Scanner;

public class IntegersThatSumToSameValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i+j == N)
                    count++;
            }
        }
        System.out.println(count);
    }
}
