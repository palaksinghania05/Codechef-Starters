/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-10-2022
 */

package y2022.october.starter60;

import java.util.Scanner;

public class PaperCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println((int)Math.pow(N/K,2));
            T--;
        }
    }
}
