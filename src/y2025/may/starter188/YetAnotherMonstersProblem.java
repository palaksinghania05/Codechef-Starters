package y2025.may.starter188;

import java.util.Arrays;
import java.util.Scanner;

public class YetAnotherMonstersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int result = N;
            for (int i = 0; i < N; i++) {
                result = Math.min(result, arr[i] + N - i - 1);
            }
            System.out.println(result);
        }
    }
}
