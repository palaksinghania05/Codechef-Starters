/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-08-2022
 */

package y2022.august.starter51;

import java.util.HashMap;
import java.util.Scanner;

public class DominantElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i<N; i++){
                int a = sc.nextInt();
                if(!map.containsKey(a))
                    map.put(a,1);
                else
                    map.put(a, map.get(a)+1);
            }
            if(map.size()==1)
                System.out.println("YES");
            else if(N==map.size())
                System.out.println("NO");
            else{
                int max = 0;
                for(int i : map.values()){
                    if(max<i)
                        max = i;
                }
                int key = 0;
                for(int i: map.keySet()){
                    if(map.get(i)==max)
                        key++;
                }
                if(key==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
