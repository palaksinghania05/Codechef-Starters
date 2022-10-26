/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-10-2022
 */

package y2022.october.starter62;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y==0 || Y%X==0){
                if(Y/X<=N)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }else{
                System.out.println("No");
            }
            T--;
        }
    }
}
