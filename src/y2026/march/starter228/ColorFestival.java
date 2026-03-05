package y2026.march.starter228;

import java.util.HashSet;
import java.util.Scanner;

public class ColorFestival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < X; j++) {
                set.add(sc.nextInt());
            }

            System.out.println(set.size());
        }
    }
}
