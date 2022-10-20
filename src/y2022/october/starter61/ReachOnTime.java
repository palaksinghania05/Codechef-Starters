/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-10-2022
 */

package y2022.october.starter61;

import java.util.Scanner;

public class ReachOnTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X>=30)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
