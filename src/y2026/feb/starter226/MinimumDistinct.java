package y2026.feb.starter226;

import java.util.*;

public class MinimumDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int x : arr)
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            int firstValue = arr[0];
            List<Integer> list = new ArrayList<>();
            for (int key : freq.keySet()) {
                if (key != firstValue)
                    list.add(freq.get(key));
            }
            Collections.sort(list);
            int result = freq.size();
            for (int f : list) {
                if (K >= f) {
                    K -= f;
                    result--;
                } else
                    break;
            }
            System.out.println(result);
        }
    }
}
