package y2026.feb.starter227;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BuyingTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            String S = sc.next();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    list.add(A[i]);
                }
            }
            if (list.size() < K) {
                System.out.println(-1);
                continue;
            }
            Collections.sort(list);
            int result = 0;
            for (int i = 0; i < K; i++) {
                result += list.get(i);
            }
            System.out.println(result);
        }
    }
}
