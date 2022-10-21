/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-10-2022
 */

package y2022.october.starter61;

import java.util.Scanner;

public class DifferentConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String S = sc.next();
            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if(S.charAt(i)==S.charAt(i+1))
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
