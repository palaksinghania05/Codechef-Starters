/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-08-2022
 */

package y2022.august.starter51;

import java.util.Scanner;

public class TVDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            if(A-C<B-D)
                System.out.println("First");
            else if(A-C>B-D)
                System.out.println("Second");
            else
                System.out.println("Any");

            T--;
        }
    }
}
