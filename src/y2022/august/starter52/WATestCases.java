/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-08-2022
 */

package y2022.august.starter52;

import java.util.Scanner;

public class WATestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            String v = sc.next();
            char[] test = v.toCharArray();
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if(test[i]=='0'){
                    if(result>arr[i])
                        result = arr[i];
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
