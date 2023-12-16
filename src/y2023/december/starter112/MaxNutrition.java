package y2023.december.starter112;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MaxNutrition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int type = sc.nextInt();
                al.add(type);
            }
            for (int i = 0; i < N; i++) {
                int nut = sc.nextInt();
                map.put(al.get(i), Math.max(map.getOrDefault(al.get(i), 0), nut));
            }
            int result = 0;
            for (Integer i : map.keySet()) {
                if (map.get(i) > 0) {
                    result += map.get(i);
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
