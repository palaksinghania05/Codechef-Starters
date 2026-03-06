package y2026.march.starter228;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinAndOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            long score = 0;
            for (int j = 0; j <= N; j++) {
                list.add(j);
            }
            while (list.size() > 1) {
                Collections.sort(list);
                int y = list.remove(list.size() - 1);
                int x = list.remove(list.size() - 1);
                score += Math.max(x, y);
                int anding = x & y;
                if (!list.contains(anding)) {
                    list.add(anding);
                }
            }
            System.out.println(score);
        }
    }
}
