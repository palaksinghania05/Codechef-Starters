package y2024.july.starter145;

import java.util.HashSet;
import java.util.Scanner;

public class MakeMyArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele != 0)
                    set.add(ele);
            }
            if (set.size() <= 1)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
