/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-09-2022
 */

package y2022.september.starter57;

import java.util.Scanner;

public class NonNegativeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int f = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if(arr[i] == 0) {
                    f = 1;
                    break;
                } else if(arr[i]<0)
                    count++;
            }
            if(f==1)
                System.out.println(0);
            else if(count%2==0)
                System.out.println(0);
            else
                System.out.println(1);
            T--;
        }
    }
}
