/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-09-2022
 */

package y2022.september.starter58;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveBadElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] A = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if(map.containsKey(A[i]))
                    map.put(A[i],map.get(A[i])+1);
                else
                    map.put(A[i],1);
            }
            if(map.size() == 1)
                System.out.println(0);
            else{
                for (int e:map.keySet()){
                    if(map.get(e)>max)
                        max = map.get(e);
                }
                System.out.println(N-max);
            }
            T--;
        }
    }
}
