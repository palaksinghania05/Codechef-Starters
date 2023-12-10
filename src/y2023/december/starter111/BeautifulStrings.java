package y2023.december.starter111;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            long product = 1;
            int mod = (int) 1e9 + 7;
            for (Character x : map.keySet()) {
                product = (product * (map.get(x) + 1)) % mod;
            }
            System.out.println(product - 1);
            T--;
        }
    }
}
