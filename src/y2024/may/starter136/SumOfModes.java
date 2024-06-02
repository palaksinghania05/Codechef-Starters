package y2024.may.starter136;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfModes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            String S = sc.next();
            HashMap<Long, Long> map = new HashMap<>();
            long sum = 0;
            long count = 0;
            map.put(0L, 1L);
            for (int i = 0; i < N; i++) {
                sum += (S.charAt(i) == '0') ? 1 : -1;
                count += map.getOrDefault(sum, 0L);
                map.put(sum, map.getOrDefault(sum, 0L) + 1);
            }

            long result = (N * (N + 1)) / 2;
            System.out.println(result + count);
            T--;
        }
    }
}
