package y2026.apr.starter233;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABOrC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                list.add(new int[]{a, i});
                list.add(new int[]{b, i});
                list.add(new int[]{c, i});
            }
            list.sort(Comparator.comparingInt(x -> x[0]));
            int[] count = new int[N];
            int temp = 0;
            int result = Integer.MAX_VALUE;
            int temp2 = 0;
            for (int[] ints : list) {
                int val = ints[0];
                int row = ints[1];

                if (count[row] == 0) temp++;
                count[row]++;

                while (temp == N) {
                    result = Math.min(result, ints[0] - list.get(temp2)[0]);
                    int lrow = list.get(temp2)[1];
                    count[lrow]--;
                    if (count[lrow] == 0) temp--;
                    temp2++;
                }
            }
            System.out.println(result);
        }
    }
}
