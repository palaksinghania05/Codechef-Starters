package y2025.march.starter177;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipOrReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<int[]> result = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    list.add(i);
                }
            }
            int i = 0;
            while (i < list.size()) {
                int j = i + 1;
                while (j < list.size() && list.get(j) == list.get(j - 1) + 1) {
                    j++;
                }
                result.add(new int[]{list.get(i), list.get(j - 1)});
                i = j;
            }
            System.out.println(result.size());
            for (int[] arr : result) {
                System.out.println(1 + " " + (arr[0] + 1) + " " + (arr[1] + 1));
            }
        }
    }
}
