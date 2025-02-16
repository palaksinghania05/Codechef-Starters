package y2025.february.starter173;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Introverts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] P = new int[N];
            int[] temp = new int[N + 1];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
                temp[P[i]] = i;
            }
            if (N <= 2) {
                System.out.println("YES");
                continue;
            }
            if ((P[0] != 1 && P[0] != 2) || (P[N - 1] != 1 && P[N - 1] != 2)) {
                System.out.println("NO");
                continue;
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
            TreeSet<Integer> set = new TreeSet<>();
            queue.offer((N - 1) / 2);
            set.add(0);
            set.add(N - 1);
            boolean result = true;
            for (int i = 3; i <= N; i++) {
                int ele = temp[i];
                int lb = set.floor(ele);
                int ub = set.ceiling(ele);
                int diff = Math.min(ub - ele, ele - lb);
                if (diff == queue.peek()) {
                    queue.poll();
                    queue.offer((ub - ele) / 2);
                    queue.offer((ele - lb) / 2);
                    set.add(ele);
                } else if (diff < queue.peek()) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
