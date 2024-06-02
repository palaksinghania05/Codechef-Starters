package y2024.may.starter136;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfModes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int[] arr = new int[N];
            long result = (N * (long) (N + 1)) / 2;
            for (int i = 0; i < N; i++) {
                arr[i] = (S.charAt(i) == '0') ? -1 : 1;
            }
            long[] temp = new long[N];
            temp[0] = arr[0];
            for (int i = 1; i < N; i++) {
                temp[i] = arr[i] + temp[i - 1];
            }
            Map<Long, Long> map = new HashMap<>();
            if (N == 1) {
                System.out.println(1);
            } else {
                map.put((long) 0, (long) 1);
                int i = 0;
                while (i < N) {
                    long sum = temp[i];
                    if (map.containsKey(sum)) {
                        result = result + map.get(sum);
                        map.put(sum, map.get(sum) + 1);
                    } else {
                        map.put(sum, (long) 1);
                    }
                    i++;
                }
                System.out.println(result);
                T--;
            }
        }
    }
}
