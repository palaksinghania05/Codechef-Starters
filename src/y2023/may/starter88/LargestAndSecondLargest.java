package y2023.may.starter88;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] ans = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> unique = new HashSet<>();
            for (int i = 0; i < N; i++) {
                unique.add(arr[i]);
            }
            int i = 0;
            for (int j : unique) {
                ans[i++] = j;
            }
            Arrays.sort(ans);
            System.out.println(ans[N - 1] + ans[N - 2]);
            T--;
        }
    }
}
