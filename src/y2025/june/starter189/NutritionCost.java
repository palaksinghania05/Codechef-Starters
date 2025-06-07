package y2025.june.starter189;

import java.util.*;

public class NutritionCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int vit = A[i];
                int cost = B[i];
                if (!map.containsKey(vit) || map.get(vit) > cost) {
                    map.put(vit, cost);
                }
            }
            List<Integer> costs = new ArrayList<>(map.values());
            Collections.sort(costs);
            int maxValue = 0;
            int totalCost = 0;
            for (int i = 0; i < costs.size(); i++) {
                totalCost += costs.get(i);
                int value = C * (i + 1) - totalCost;
                maxValue = Math.max(maxValue, value);
            }
            System.out.println(maxValue);
        }
    }
}
