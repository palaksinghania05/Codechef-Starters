package y2025.february.starter174;

import java.util.*;

public class DeletionAndDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[N];
            int result = N;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            List<Integer> keys = new ArrayList<>(map.keySet());
            for (int key : keys) {
                int value = map.get(key);
                if (key == 0) continue;
                if (value >= 2) {
                    result -= value / 2;
                    map.put(0, map.getOrDefault(0, 0) + value / 2);
                }
            }
            if (map.getOrDefault(0, 0) > 0) {
                result -= map.get(0) - 1;
            }
            System.out.println(result);
        }
    }
}
