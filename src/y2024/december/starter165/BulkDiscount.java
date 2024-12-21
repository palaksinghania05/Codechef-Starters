package y2024.december.starter165;

import java.util.Arrays;
import java.util.Scanner;

public class BulkDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            int result = 0;
            Arrays.sort(arr);
            for (int i = 0; i < N; i++) {
                result += Math.max(0, arr[i] - i);
            }
            System.out.println(result);
            T--;
        }
    }
}
