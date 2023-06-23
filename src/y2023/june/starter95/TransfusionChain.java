package y2023.june.starter95;

import java.util.Scanner;

public class TransfusionChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = 0, b = 0, ab = 0, o = 0;
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                if (s.equals("A"))
                    ++a;
                else if (s.equals("B"))
                    ++b;
                else if (s.equals("O"))
                    ++o;
                else
                    ++ab;
            }
            int max = Math.max(a, b);
            max += ab + o;
            System.out.println(max);
            T--;
        }
    }
}
