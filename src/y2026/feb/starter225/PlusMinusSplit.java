package y2026.feb.starter225;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PlusMinusSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                set.add(Math.abs(sc.nextInt()));
            }
            if (set.size() > 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
