package y2025.march.starter178;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmoothlyIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            int N = sc.nextInt();
            List<Long> A = new ArrayList<>();
            for (int i = 0; i < N; i++)
                A.add(sc.nextLong());
            if (N >= 35) {
                for (int i = 0; i < N; i++) System.out.print(0);
                System.out.println();
                continue;
            }
            for (int i = 0; i < N; i++) {
                List<Long> list = new ArrayList<>(A);
                list.remove(i);
                boolean flag = true;
                while (list.size() > 1) {
                    for (int j = 0; j < list.size() - 1; j++) {
                        if (list.get(j) >= list.get(j + 1)) {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag)
                        break;
                    List<Long> temp2 = new ArrayList<>();
                    for (int j = 0; j < list.size() - 1; j++)
                        temp2.add(list.get(j + 1) - list.get(j));
                    list = temp2;
                }
                System.out.print(flag ? 1 : 0);
            }
            System.out.println();
        }
    }
}
