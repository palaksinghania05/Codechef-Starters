package y2024.july.starter144;

import java.util.*;

public class LargestK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; ++i) {
                A[i] = sc.nextInt();
                map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            }
            List<Integer> frequencies = new ArrayList<>(map.values());
            Collections.sort(frequencies);
            long sum = 0;
            int max = 0;
            int count = 1;
            for (int i = frequencies.size() - 1; i >= 0; --i) {
                sum += frequencies.get(i);
                int potentialMax = (int) ((sum / count) * count);
                max = Math.max(max, potentialMax);
                count++;
            }
            System.out.println(max);
            T--;
        }
    }
}
