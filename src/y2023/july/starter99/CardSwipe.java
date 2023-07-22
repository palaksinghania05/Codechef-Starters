package y2023.july.starter99;

import java.util.HashMap;
import java.util.Scanner;

public class CardSwipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> A = new HashMap<>();
            int current = 0, maximum = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (!(A.containsKey(ele))) {
                    current++;
                    A.put(ele, 1);
                } else {
                    current--;
                    A.remove(ele);
                }
                maximum = Math.max(maximum, current);
            }
            System.out.println(maximum);
            T--;
        }
    }
}
