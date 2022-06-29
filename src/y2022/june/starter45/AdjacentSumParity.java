/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-06-2022
 */

package y2022.june.starter45;

import java.util.Scanner;

public class AdjacentSumParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            if(sum%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
