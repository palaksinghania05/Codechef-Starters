/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-10-2022
 */

package y2022.october.starter60;

import java.util.HashMap;
import java.util.Scanner;

public class CardRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],1);
                else
                    map.put(arr[i], map.get(arr[i])+1);
            }
            int max = 0;
            for (Integer e: map.values()) {
                if(max<e)
                    max = e;
            }
            System.out.println(N-max);
            T--;
        }
    }
}
