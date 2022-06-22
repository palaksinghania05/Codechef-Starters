/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

package y2022.june.starter43;

import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = A>B ? B : A;
            System.out.println(result);
            T--;
        }
    }
}
