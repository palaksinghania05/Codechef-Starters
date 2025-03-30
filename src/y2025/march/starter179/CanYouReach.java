package y2025.march.starter179;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CanYouReach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < (long) N; i++)
                H[i] = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < (long) N - 1; j++) {
                if (H[j - 1] == H[j + 1])
                    list.add(j);
            }
            long result = ((long) N * ((long) N - 1)) / 2;
            int temp = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                result -= (list.get(i) - temp) * ((long) N - 1 - list.get(i + 1));
                temp = list.get(i);
            }
            System.out.println(result);
        }
    }
}
