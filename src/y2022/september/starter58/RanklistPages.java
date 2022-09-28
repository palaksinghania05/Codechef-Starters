/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-09-2022
 */

package y2022.september.starter58;

import java.util.Scanner;

public class RanklistPages {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X%25==0)
                System.out.println(X/25);
            else
                System.out.println((X/25)+1);
            T--;
        }
    }
}
