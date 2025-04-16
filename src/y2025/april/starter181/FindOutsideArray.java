package y2025.april.starter181;

import java.util.Scanner;
import java.util.TreeSet;

public class FindOutsideArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                set.add(arr[i]);
            }
            if (set.contains(0) && set.size() == 1) {
                System.out.println(-1);
            } else {
                if (max > min && max > 0) {
                    System.out.println(max + " " + max);
                } else {
                    System.out.println(min + " " + min);
                }
            }
        }
    }
}
