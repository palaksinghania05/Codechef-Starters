/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-10-2022
 */

package y2022.october.starter62;

import java.util.Scanner;

public class MakeMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A<=B/2 || A==B)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
