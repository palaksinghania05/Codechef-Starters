package y2026.apr.starter232;

import java.util.HashMap;
import java.util.Scanner;

public class EqualDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        while (S-- > 0) {
            int K = sc.nextInt();
            int[] Y = new int[K];
            for (int i = 0; i < K; i++) {
                Y[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            long result = 0;
            for (int i = 0; i < K; i++) {
                int values = Y[i] - i;

                if (map.containsKey(values)) {
                    result += map.get(values);
                    map.put(values, map.get(values) + 1);
                } else {
                    map.put(values, 1);
                }
            }
            System.out.println(result);
        }
    }
}
