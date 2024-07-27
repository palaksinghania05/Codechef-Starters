package y2024.july.starter144;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetAllotment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] A = new int[N];
            long result = 0;
            long temp = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] >= X) {
                    result++;
                    temp += A[i] - X;
                } else {
                    list.add(X - A[i]);
                }
            }
            Collections.sort(list);
            for (int def : list) {
                if (temp >= def) {
                    temp -= def;
                    result++;
                } else
                    break;
            }
            System.out.println(result);
            T--;
        }
    }
}
