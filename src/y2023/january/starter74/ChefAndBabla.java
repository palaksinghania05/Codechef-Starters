/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-01-2023
 */

package y2023.january.starter74;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndBabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> positive = new ArrayList<>();
            ArrayList<Integer> negative = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele >= 0) {
                    positive.add(ele);
                    min = Math.min(min, ele);
                } else {
                    negative.add(ele);
                    max = Math.max(max, ele);
                }
            }
            if (max == 0 || min == 0)
                System.out.println(-1);
            else if (max == Integer.MIN_VALUE) {
                System.out.println(min - 1);
            } else if (min == Integer.MAX_VALUE) {
                System.out.println(Math.abs(max + 1));
            } else
                System.out.println(Math.min(min, Math.abs(max)) - 1);
//            int[] arr = new int[N];
//            for (int i = 0; i < N; i++) {
//                arr[i] = sc.nextInt();
//            }
//            ArrayList<Integer> a = new ArrayList<>();
//            for (int i = 0; i < N; i++) {
//                if(arr[i]>0)
//                    a.add(arr[i]);
//            }
//            Collections.sort(a);
//            if(a.size()==0)
//                System.out.println(-1);
//            else
//                System.out.println(a.get(0)-1);
            T--;
        }
    }
}
