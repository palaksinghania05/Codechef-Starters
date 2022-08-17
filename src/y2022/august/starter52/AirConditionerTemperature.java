/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-08-2022
 */

package y2022.august.starter52;

import java.util.Scanner;

public class AirConditionerTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int max = Math.max(A,Math.max(B,C));
            if(max==B){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
            T--;
        }
    }
}
