/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-11-2022
 */

package y2022.november.starter65;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] arr = new int[2*N];
            for (int i = 0; i < 2*N; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < 2 * N; i++) {
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],1);
                else
                    map.put(arr[i],map.get(arr[i])+1);
            }
            int f = 0;
            for (Integer e :
                    map.keySet()) {
                if (map.get(e) > 2) {
                    System.out.println("No");
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.println("Yes");
            T--;
        }
    }
}
