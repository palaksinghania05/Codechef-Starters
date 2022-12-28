/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-12-2022
 */

package y2022.december.starter71;

import java.util.HashMap;
import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (map.containsKey(ele))
                    map.put(ele, map.get(ele) + 1);
                else
                    map.put(ele, 1);
            }
            int f = 0;
            for (Integer i : map.values()) {
                //  System.out.print(i+" ");
                if (i % 2 != 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
