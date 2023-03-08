package y2023.march.starter80;

import java.util.HashMap;
import java.util.Scanner;

public class EqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int e = sc.nextInt();
                if (!map.containsKey(e))
                    map.put(e, 1);
                else
                    map.put(e, map.get(e) + 1);
            }
            int max = Integer.MIN_VALUE;
            for (int ele : map.keySet()) {
                max = Math.max(max, map.get(ele));
            }
            System.out.println(N - max);
            T--;
        }
    }
}
