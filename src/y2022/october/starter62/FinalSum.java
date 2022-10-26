/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-10-2022
 */

package y2022.october.starter62;

import java.util.Arrays;
import java.util.Scanner;

public class FinalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int[] arr = new int[N];
            int s = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                s = s+arr[i];
            }
            for (int i = 0; i < Q; i++) {
                int L = sc.nextInt();
                int R = sc.nextInt();
                if((R-L)%2==0)
                    s++;
//                for (int k = 0,j = L-1;  k<R-L+1 && j < R; j++,k++) {
//                    if(k%2==0)
//                        arr[j] = arr[j]+1;
//                    else
//                        arr[j]=arr[j]-1;
//                }
//            //    System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);

//            for (int i = 0; i < N; i++) {
//                s = s+arr[i];
//            }
//            System.out.println(s);
            T--;
        }
    }
}
