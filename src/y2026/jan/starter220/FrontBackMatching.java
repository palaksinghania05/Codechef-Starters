package y2026.jan.starter220;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FrontBackMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            Set<Character> set = new HashSet<>();
            boolean found = false;
            for (char ch : S.toCharArray()) {
                if (set.contains(ch)) {
                    found = true;
                    break;
                }
                set.add(ch);
            }
            if (found) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
