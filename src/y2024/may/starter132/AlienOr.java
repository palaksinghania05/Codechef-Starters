package y2024.may.starter132;

import java.util.HashSet;
import java.util.Scanner;

public class AlienOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                int count = 0;
                for (int j = 0; j < K; j++) {
                    if (s.charAt(j) == '1')
                        count++;
                }
                if (count == 1)
                    set.add(s);
            }
            if (set.size() == K) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            T--;
        }
    }
}
