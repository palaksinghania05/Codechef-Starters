package y2025.october.starter206;

import java.util.Arrays;
import java.util.Scanner;

public class ExpensiveBuying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0, i = N - 1;
            while (K > 0) {
                sum += arr[i];
                i--;
                K--;
            }
            System.out.println(sum);
        }
    }
}
