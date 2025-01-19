package y2025.january.starter169;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeKMostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            int temp = 0;
            for (int i = 0; i < N; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                temp = Math.max(temp, map.get(arr[i]));
            }
            if (map.getOrDefault(K, 0) == temp) {
                System.out.println(0);
                continue;
            }
            map.clear();
            int result = 2;
            temp = 0;
            for (int i = 0; i < N; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                temp = Math.max(temp, map.get(arr[i]));
                if (map.getOrDefault(K, 0) == temp) {
                    result = 1;
                    break;
                }
            }
            temp = 0;
            map.clear();
            if (result != 1) {
                for (int i = N - 1; i >= 0; i--) {
                    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                    temp = Math.max(temp, map.get(arr[i]));
                    if (map.getOrDefault(K, 0) == temp) {
                        result = 1;
                        break;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
