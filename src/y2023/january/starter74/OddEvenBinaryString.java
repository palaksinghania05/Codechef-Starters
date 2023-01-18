/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-01-2023
 */

package y2023.january.starter74;

import java.util.Scanner;

public class OddEvenBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele == 0)
                    count++;
            }
            if (count % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
