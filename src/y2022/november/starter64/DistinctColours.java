/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-11-2022
 */

package y2022.november.starter64;

import java.util.Scanner;

public class DistinctColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if(max<arr[i])
                    max = arr[i];
            }
            System.out.println(max);
            T--;
        }
    }
}
