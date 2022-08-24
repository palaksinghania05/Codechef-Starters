/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-08-2022
 */

package y2022.august.starter53;

import java.util.Scanner;

public class GreaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            double sum = A+B;
            double avg = sum/2;
            if(avg > C)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
