package y2025.march.starter176;

import java.util.ArrayList;
import java.util.Scanner;

public class SameEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            ArrayList<Long> list = new ArrayList<>();
            list.add(N);
            for (long i = 1; i <= M; i <<= 1) {
                if ((i & N) == 0) {
                    if ((i | N) <= M) {
                        list.add(i | N);
                    }
                }
            }
            if (list.size() == 1) {
                System.out.println("-1");
            } else {
                System.out.println(list.size());
                for (long x : list) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
