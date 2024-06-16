package y2024.june.starter138;

import java.util.Scanner;

public class PrefixSuffixInequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            StringBuilder str = new StringBuilder("");
            str.append("3 ".repeat(Math.max(0, N - 1)));
            str.append("1");
            System.out.println(str);
            T--;
        }
    }
}
