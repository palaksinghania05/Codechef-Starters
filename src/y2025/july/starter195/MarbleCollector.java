package y2025.july.starter195;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarbleCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                set.add(ele);
            }
            int result = M - set.size();
            System.out.println(result);
        }
    }
}
