package y2024.july.starter141;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RedundantArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
            long result = Integer.MAX_VALUE;
            for (Integer key : map.keySet()) {
                long freq = map.get(key);
                result = Math.min(result, (N - freq) * key);
            }
            result = Math.min(result, (N - map.getOrDefault(1, 0)));
            System.out.println(result);
            T--;
        }
    }
}
